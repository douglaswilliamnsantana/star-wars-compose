package com.douglassantana.star_wars_compose.di

import com.douglassantana.star_wars_compose.networking.repository.StarWarsRepository
import com.douglassantana.star_wars_compose.networking.StarWarsApi
import com.douglassantana.star_wars_compose.networking.repository.StarWarsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class StarWarsModule {

    @Provides
    @Singleton
    fun provideStarWarsApi(): StarWarsApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(StarWarsApi::class.java)
    }

    @Provides
    @Singleton
    fun provideStarWarsRepository(api: StarWarsApi): StarWarsRepository {
        return StarWarsRepositoryImpl(api)
    }
}