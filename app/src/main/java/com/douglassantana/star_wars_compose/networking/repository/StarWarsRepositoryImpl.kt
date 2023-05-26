package com.douglassantana.star_wars_compose.networking.repository

import com.douglassantana.star_wars_compose.networking.StarWarsApi
import com.douglassantana.star_wars_compose.networking.models.StarWarsFilmsResponse
import javax.inject.Inject

class StarWarsRepositoryImpl @Inject constructor(
    private val api: StarWarsApi
) : StarWarsRepository {

    override suspend fun getStarWarsFilms(): StarWarsFilmsResponse {
        return api.getStarWarsFilms()
    }
}