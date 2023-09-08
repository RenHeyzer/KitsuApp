package com.ren.kitsuapp.utils.mappers.dtos

import com.ren.kitsuapp.data.remote.dtos.image.CoverImageDto
import com.ren.kitsuapp.data.remote.dtos.image.MetaDto
import com.ren.kitsuapp.domain.models.image.CoverImage
import com.ren.kitsuapp.domain.models.image.Meta
import com.ren.kitsuapp.utils.mappers.Mapper
import javax.inject.Inject

class CoverImageDtoMapper @Inject constructor(
    private val metaDtoMapper: Mapper<MetaDto, Meta>
) : Mapper<CoverImageDto, CoverImage> {

    override fun toModel(model: CoverImageDto) = CoverImage(
        small = model.small,
        original = model.original,
        large = model.large,
        tiny = model.tiny,
        meta = metaDtoMapper.toModel(model.meta)
    )

    override fun fromModel(model: CoverImage) = CoverImageDto(
        small = model.small,
        original = model.original,
        large = model.large,
        tiny = model.tiny,
        meta = metaDtoMapper.fromModel(model.meta)
    )
}