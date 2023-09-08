package com.ren.kitsuapp.domain.repositories

import com.ren.kitsuapp.domain.either.Either
import com.ren.kitsuapp.domain.models.KitsuResponse
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {

    fun fetchAnime(): Flow<Either<String, KitsuResponse>>
}