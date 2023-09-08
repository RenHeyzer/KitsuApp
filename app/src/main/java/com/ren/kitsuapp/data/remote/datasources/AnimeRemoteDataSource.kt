package com.ren.kitsuapp.data.remote.datasources

import com.ren.kitsuapp.domain.either.Either
import com.ren.kitsuapp.domain.models.KitsuResponse
import kotlinx.coroutines.flow.Flow

interface AnimeRemoteDataSource {

    fun fetchAnime(): Flow<Either<String, KitsuResponse>>
}