package com.ren.kitsuapp.utils.mappers.dtos

import com.ren.kitsuapp.data.remote.dtos.image.MetaDto
import com.ren.kitsuapp.data.remote.dtos.image.PosterImageDto
import com.ren.kitsuapp.domain.models.image.Meta
import com.ren.kitsuapp.domain.models.image.PosterImage
import com.ren.kitsuapp.utils.mappers.Mapper
import javax.inject.Inject

class PosterImageDtoMapper @Inject constructor(
    private val metaDtoMapper: Mapper<MetaDto, Meta>,
) : Mapper<PosterImageDto, PosterImage> {

    override fun toModel(model: PosterImageDto) = PosterImage(
        small = model.small,
        original = model.original,
        large = model.large,
        tiny = model.tiny,
        meta = metaDtoMapper.toModel(model.meta),
        medium = model.medium
    )
    override fun fromModel(model: PosterImage) = PosterImageDto(
        small = model.small,
        original = model.original,
        large = model.large,
        tiny = model.tiny,
        meta = metaDtoMapper.fromModel(model.meta),
        medium = model.medium
    )
}