package com.ren.kitsuapp.utils.mappers.dtos

import com.ren.kitsuapp.data.remote.dtos.DataItemDto
import com.ren.kitsuapp.data.remote.dtos.KitsuResponseDto
import com.ren.kitsuapp.data.remote.dtos.LinksDto
import com.ren.kitsuapp.domain.models.DataItem
import com.ren.kitsuapp.domain.models.KitsuResponse
import com.ren.kitsuapp.domain.models.Links
import com.ren.kitsuapp.utils.mappers.Mapper
import javax.inject.Inject

class KitsuResponseDtoMapper @Inject constructor(
    private val dataItemDtoMapper: Mapper<DataItemDto, DataItem>,
    private val metaDtoMapper: Mapper<KitsuResponseDto.Meta, KitsuResponse.Meta>,
    private val linksDtoMapper: Mapper<LinksDto, Links>
) : Mapper<KitsuResponseDto, KitsuResponse> {

    override fun toModel(model: KitsuResponseDto) = KitsuResponse(
        data = model.data.map {
            dataItemDtoMapper.toModel(it)
        },
        meta = metaDtoMapper.toModel(model.meta),
        links = linksDtoMapper.toModel(model.links)
    )

    override fun fromModel(model: KitsuResponse) = KitsuResponseDto(
        data = model.data.map {
            dataItemDtoMapper.fromModel(it)
        },
        meta = metaDtoMapper.fromModel(model.meta),
        links = linksDtoMapper.fromModel(model.links)
    )

    class MetaDtoMapper @Inject constructor() : Mapper<KitsuResponseDto.Meta, KitsuResponse.Meta> {

        override fun toModel(model: KitsuResponseDto.Meta) = KitsuResponse.Meta(
            model.count
        )

        override fun fromModel(model: KitsuResponse.Meta) = KitsuResponseDto.Meta(
            model.count
        )
    }
}