package com.ren.kitsuapp.utils.mappers.ui

import com.ren.kitsuapp.domain.models.image.Dimensions
import com.ren.kitsuapp.presentation.models.image.DimensionsUi
import com.ren.kitsuapp.utils.mappers.Mapper
import javax.inject.Inject

class DimensionsUiMapper @Inject constructor(
    private val tinyUiMapper: Mapper<Dimensions.Tiny, DimensionsUi.Tiny>,
    private val largeUiMapper: Mapper<Dimensions.Large, DimensionsUi.Large>,
    private val smallUiMapper: Mapper<Dimensions.Small, DimensionsUi.Small>,
    private val mediumUiMapper: Mapper<Dimensions.Medium, DimensionsUi.Medium>
) : Mapper<Dimensions, DimensionsUi> {

    override fun toModel(model: Dimensions) = DimensionsUi(
        tiny = tinyUiMapper.toModel(model.tiny),
        large = largeUiMapper.toModel(model.large),
        small = smallUiMapper.toModel(model.small),
        medium = model.medium?.let { mediumUiMapper.toModel(it) }
    )

    override fun fromModel(model: DimensionsUi) = Dimensions(
        tiny = tinyUiMapper.fromModel(model.tiny),
        large = largeUiMapper.fromModel(model.large),
        small = smallUiMapper.fromModel(model.small),
        medium = model.medium?.let { mediumUiMapper.fromModel(it) }
    )

    class TinyUiMapper @Inject constructor() : Mapper<Dimensions.Tiny, DimensionsUi.Tiny> {

        override fun toModel(model: Dimensions.Tiny) = DimensionsUi.Tiny(
            width = model.width,
            height = model.height
        )

        override fun fromModel(model: DimensionsUi.Tiny) = Dimensions.Tiny(
            width = model.width,
            height = model.height
        )
    }

    class LargeUiMapper @Inject constructor() : Mapper<Dimensions.Large, DimensionsUi.Large> {

        override fun toModel(model: Dimensions.Large) = DimensionsUi.Large(
            width = model.width,
            height = model.height
        )

        override fun fromModel(model: DimensionsUi.Large) = Dimensions.Large(
            width = model.width,
            height = model.height
        )
    }

    class SmallUiMapper @Inject constructor() : Mapper<Dimensions.Small, DimensionsUi.Small> {

        override fun toModel(model: Dimensions.Small) = DimensionsUi.Small(
            width = model.width,
            height = model.height
        )

        override fun fromModel(model: DimensionsUi.Small) = Dimensions.Small(
            width = model.width,
            height = model.height
        )
    }

    class MediumUiMapper @Inject constructor() : Mapper<Dimensions.Medium, DimensionsUi.Medium> {

        override fun toModel(model: Dimensions.Medium) = DimensionsUi.Medium(
            width = model.width,
            height = model.height
        )

        override fun fromModel(model: DimensionsUi.Medium) = Dimensions.Medium(
            width = model.width,
            height = model.height
        )
    }
}