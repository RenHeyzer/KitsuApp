package com.ren.kitsuapp.utils.mappers.dtos

import com.ren.kitsuapp.data.remote.dtos.image.MetaDto
import com.ren.kitsuapp.domain.models.image.Meta
import com.ren.kitsuapp.utils.mappers.Mapper
import javax.inject.Inject

class MetaDtoMapper @Inject constructor(
    private val dimensionsDtoMapper: DimensionsDtoMapper
) : Mapper<MetaDto, Meta> {

    override fun toModel(model: MetaDto) = Meta(
        dimensionsDtoMapper.toModel(model.dimensions)
    )

    override fun fromModel(model: Meta) = MetaDto(
        dimensionsDtoMapper.fromModel(model.dimensions)
    )
}