package com.douglassantana.star_wars_compose.networking

import com.douglassantana.star_wars_compose.networking.models.StarWarsFilmsResponse
import retrofit2.http.GET

interface StarWarsApi {

    @GET("api/films")
    suspend fun getStarWarsFilms(): StarWarsFilmsResponse
}