package com.douglassantana.star_wars_compose.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.douglassantana.star_wars_compose.domain.model.StarWarsFilmsModel
import com.douglassantana.star_wars_compose.domain.useCase.GetStarWarsFilmsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class StarWarsViewModel @Inject constructor(
    private val useCase: GetStarWarsFilmsUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(StarWarsFilmsModel())
    val uiState: StateFlow<StarWarsFilmsModel> = _uiState

    fun getStarWarsFilms() {
        useCase.invoke()
            .onEach { result ->
                success(result)
            }.launchIn(viewModelScope)
    }

    private fun success(starWarsFilmsModel: StarWarsFilmsModel) {
        _uiState.value = starWarsFilmsModel
    }
}