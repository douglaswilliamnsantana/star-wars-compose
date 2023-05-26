package com.douglassantana.star_wars_compose.mapper

import com.douglassantana.star_wars_compose.domain.model.StarWarsFilmsItemModel
import com.douglassantana.star_wars_compose.domain.model.StarWarsFilmsModel
import com.douglassantana.star_wars_compose.networking.models.StarWarsFilmsItemResponse
import com.douglassantana.star_wars_compose.networking.models.StarWarsFilmsResponse

fun StarWarsFilmsResponse.toStarWarsFilmsModel() : StarWarsFilmsModel {
    return StarWarsFilmsModel(
        count = this.count ?: 0,
        results = this.results?.map {
            it.toStarWarsHomeItemModel()
        }.orEmpty()
    )
}

fun StarWarsFilmsItemResponse?.toStarWarsHomeItemModel() : StarWarsFilmsItemModel {
    return StarWarsFilmsItemModel(
        title = this?.title.orEmpty(),
        episodeId = this?.episodeId ?: 0,
        openingCrawl = this?.openingCrawl.orEmpty(),
        director = this?.director.orEmpty(),
        producer = this?.producer.orEmpty(),
        releaseDate = this?.releaseDate.orEmpty(),
        characters = this?.characters.orEmpty(),
        planets = this?.planets.orEmpty(),
        starships = this?.starships.orEmpty(),
        vehicles = this?.vehicles.orEmpty(),
        species = this?.species.orEmpty(),
        created = this?.created.orEmpty(),
        edited = this?.edited.orEmpty(),
        urlFilm = this?.edited.orEmpty()
    )
}