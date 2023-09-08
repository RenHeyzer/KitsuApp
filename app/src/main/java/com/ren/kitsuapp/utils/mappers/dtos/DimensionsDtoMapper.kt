package com.ren.kitsuapp.utils.mappers.dtos

import com.ren.kitsuapp.data.remote.dtos.image.DimensionsDto
import com.ren.kitsuapp.domain.models.image.Dimensions
import com.ren.kitsuapp.utils.mappers.Mapper
import javax.inject.Inject

class DimensionsDtoMapper @Inject constructor(
    private val tinyDtoMapper: Mapper<DimensionsDto.Tiny, Dimensions.Tiny>,
    private val largeDtoMapper: Mapper<DimensionsDto.Large, Dimensions.Large>,
    private val smallDtoMapper: Mapper<DimensionsDto.Small, Dimensions.Small>,
    private val mediumDtoMapper: Mapper<DimensionsDto.Medium, Dimensions.Medium>
) : Mapper<DimensionsDto, Dimensions> {

    override fun toModel(model: DimensionsDto) = Dimensions(
        tiny = tinyDtoMapper.toModel(model.tiny),
        large = largeDtoMapper.toModel(model.large),
        small = smallDtoMapper.toModel(model.small),
        medium = model.medium?.let { mediumDtoMapper.toModel(it) }
    )

    override fun fromModel(model: Dimensions) = DimensionsDto(
        tiny = tinyDtoMapper.fromModel(model.tiny),
        large = largeDtoMapper.fromModel(model.large),
        small = smallDtoMapper.fromModel(model.small),
        medium = model.medium?.let { mediumDtoMapper.fromModel(it) }
    )

    class TinyDtoMapper @Inject constructor() : Mapper<DimensionsDto.Tiny, Dimensions.Tiny> {

        override fun toModel(model: DimensionsDto.Tiny) = Dimensions.Tiny(
            width = model.width,
            height = model.height
        )

        override fun fromModel(model: Dimensions.Tiny) = DimensionsDto.Tiny(
            width = model.width,
            height = model.height
        )
    }

    class LargeDtoMapper @Inject constructor() : Mapper<DimensionsDto.Large, Dimensions.Large> {

        override fun toModel(model: DimensionsDto.Large) = Dimensions.Large(
            width = model.width,
            height = model.height
        )

        override fun fromModel(model: Dimensions.Large) = DimensionsDto.Large(
            width = model.width,
            height = model.height
        )
    }

    class SmallDtoMapper @Inject constructor() : Mapper<DimensionsDto.Small, Dimensions.Small> {

        override fun toModel(model: DimensionsDto.Small) = Dimensions.Small(
            width = model.width,
            height = model.height
        )

        override fun fromModel(model: Dimensions.Small) = DimensionsDto.Small(
            width = model.width,
            height = model.height
        )
    }

    class MediumDtoMapper @Inject constructor() : Mapper<DimensionsDto.Medium, Dimensions.Medium> {

        override fun toModel(model: DimensionsDto.Medium) = Dimensions.Medium(
            width = model.width,
            height = model.height
        )

        override fun fromModel(model: Dimensions.Medium) = DimensionsDto.Medium(
            width = model.width,
            height = model.height
        )
    }
}