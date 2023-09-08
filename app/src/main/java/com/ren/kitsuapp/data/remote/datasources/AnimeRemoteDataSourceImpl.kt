package com.ren.kitsuapp.data.remote.datasources

import com.ren.kitsuapp.data.base.BaseRemoteDataSource
import com.ren.kitsuapp.data.remote.dtos.KitsuResponseDto
import com.ren.kitsuapp.data.remote.services.AnimeApiService
import com.ren.kitsuapp.domain.models.KitsuResponse
import com.ren.kitsuapp.utils.dispatchers.AppDispatchers
import com.ren.kitsuapp.utils.mappers.Mapper
import com.ren.kitsuapp.utils.mappers.dtos.KitsuResponseDtoMapper
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

class AnimeRemoteDataSourceImpl @Inject constructor(
    private val service: AnimeApiService,
    private val kitsuResponseDtoMapper: Mapper<KitsuResponseDto, KitsuResponse>,
    private val appDispatchers: AppDispatchers
) : BaseRemoteDataSource(appDispatchers), AnimeRemoteDataSource {

    override fun fetchAnime() = doNetworkRequest(map = {
        kitsuResponseDtoMapper.toModel(it)
    }) {
        service.fetchAnime()
    }
}