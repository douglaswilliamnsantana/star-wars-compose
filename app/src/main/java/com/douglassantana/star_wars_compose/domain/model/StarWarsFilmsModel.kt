package com.douglassantana.star_wars_compose.domain.model

data class StarWarsFilmsModel(
    val count: Int? = 0,
    val results: List<StarWarsFilmsItemModel>? = listOf()
)

data class StarWarsFilmsItemModel(
    val title: String,
    val episodeId: Int,
    val openingCrawl: String,
    val director: String,
    val producer: String,
    val releaseDate: String,
    val characters: List<String?>,
    val planets: List<String?>,
    val starships: List<String?>,
    val vehicles: List<String?>,
    val species: List<String?>,
    val created: String,
    val edited: String,
    val urlFilm: String
)