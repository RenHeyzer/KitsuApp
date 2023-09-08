package com.ren.kitsuapp.data.remote.services

import com.ren.kitsuapp.data.remote.dtos.KitsuResponseDto
import retrofit2.Response
import retrofit2.http.GET

const val ANIME_ENDPOINT = "anime"

interface AnimeApiService {

    @GET(ANIME_ENDPOINT)
    suspend fun fetchAnime(): Response<KitsuResponseDto>
}