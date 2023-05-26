package com.douglassantana.star_wars_compose.networking.repository

import com.douglassantana.star_wars_compose.networking.models.StarWarsFilmsResponse

interface StarWarsRepository {

    suspend fun getStarWarsFilms(): StarWarsFilmsResponse
}