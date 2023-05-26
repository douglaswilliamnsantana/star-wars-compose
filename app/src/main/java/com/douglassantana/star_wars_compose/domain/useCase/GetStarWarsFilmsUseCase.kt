package com.douglassantana.star_wars_compose.domain.useCase

import com.douglassantana.star_wars_compose.domain.model.StarWarsFilmsModel
import com.douglassantana.star_wars_compose.networking.repository.StarWarsRepository
import com.douglassantana.star_wars_compose.mapper.toStarWarsFilmsModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetStarWarsFilmsUseCase @Inject constructor(
    private val repository: StarWarsRepository
) {
    operator fun invoke(): Flow<StarWarsFilmsModel> = flow {
        emit(repository.getStarWarsFilms().toStarWarsFilmsModel())
    }
}