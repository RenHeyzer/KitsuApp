package com.ren.kitsuapp.utils.mappers.dtos

import com.ren.kitsuapp.data.remote.dtos.AttributesDto
import com.ren.kitsuapp.data.remote.dtos.DataItemDto
import com.ren.kitsuapp.data.remote.dtos.LinksDto
import com.ren.kitsuapp.domain.models.Attributes
import com.ren.kitsuapp.domain.models.DataItem
import com.ren.kitsuapp.domain.models.Links
import com.ren.kitsuapp.utils.mappers.Mapper
import javax.inject.Inject

class DataItemDtoMapper @Inject constructor(
    private val linksDtoMapper: Mapper<LinksDto, Links>,
    private val attributesDtoMapper: Mapper<AttributesDto, Attributes>
) : Mapper<DataItemDto, DataItem> {

    override fun toModel(model: DataItemDto) = DataItem(
        links = linksDtoMapper.toModel(model.links),
        id = model.id,
        attributes = attributesDtoMapper.toModel(model.attributes),
        type = model.type
    )


    override fun fromModel(model: DataItem) = DataItemDto(
        links = linksDtoMapper.fromModel(model.links),
        id = model.id,
        attributes = attributesDtoMapper.fromModel(model.attributes),
        type = model.type
    )
}