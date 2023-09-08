package com.ren.kitsuapp.data.repositories

import com.ren.kitsuapp.data.remote.datasources.AnimeRemoteDataSource
import com.ren.kitsuapp.domain.repositories.AnimeRepository
import javax.inject.Inject

class AnimeRepositoryImpl @Inject constructor(
    private val animeRemoteDataSource: AnimeRemoteDataSource,
) : AnimeRepository {

    override fun fetchAnime() = animeRemoteDataSource.fetchAnime()
}