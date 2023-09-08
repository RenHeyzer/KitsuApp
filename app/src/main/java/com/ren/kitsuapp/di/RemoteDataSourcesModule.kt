package com.ren.kitsuapp.di

import com.ren.kitsuapp.data.remote.datasources.AnimeRemoteDataSource
import com.ren.kitsuapp.data.remote.datasources.AnimeRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RemoteDataSourcesModule {

    @Binds
    fun bindAnimeRemoteDataSource(dataSourceImpl: AnimeRemoteDataSourceImpl): AnimeRemoteDataSource
}