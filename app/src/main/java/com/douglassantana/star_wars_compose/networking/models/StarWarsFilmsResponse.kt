package com.douglassantana.star_wars_compose.networking.models

import com.google.gson.annotations.SerializedName

data class StarWarsFilmsResponse(
    @SerializedName("count") val count: Int? = null,
    @SerializedName("results") val results: List<StarWarsFilmsItemResponse>? = null
)

data class StarWarsFilmsItemResponse(
    @SerializedName("title") val title: String? = null,
    @SerializedName("episode_id") val episodeId: Int? = null,
    @SerializedName("opening_crawl") val openingCrawl: String? = null,
    @SerializedName("director") val director: String? = null,
    @SerializedName("producer") val producer: String? = null,
    @SerializedName("release_date") val releaseDate: String? = null,
    @SerializedName("characters") val characters: List<String>? = null,
    @SerializedName("planets") val planets: List<String>? = null,
    @SerializedName("starships") val starships: List<String>? = null,
    @SerializedName("vehicles") val vehicles: List<String>? = null,
    @SerializedName("species") val species: List<String>? = null,
    @SerializedName("created") val created: String? = null,
    @SerializedName("edited") val edited: String? = null,
    @SerializedName("url") val urlFilm: String? = null,
)