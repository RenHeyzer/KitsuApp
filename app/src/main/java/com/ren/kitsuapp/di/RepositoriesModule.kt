package com.ren.kitsuapp.di

import com.ren.kitsuapp.data.repositories.AnimeRepositoryImpl
import com.ren.kitsuapp.domain.repositories.AnimeRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoriesModule {

    @Binds
    fun bindAnimeRepository(repositoryImpl: AnimeRepositoryImpl): AnimeRepository
}