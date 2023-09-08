package com.ren.kitsuapp.utils.mappers.ui

import com.ren.kitsuapp.domain.models.image.Meta
import com.ren.kitsuapp.domain.models.image.PosterImage
import com.ren.kitsuapp.presentation.models.image.MetaUi
import com.ren.kitsuapp.presentation.models.image.PosterImageUi
import com.ren.kitsuapp.utils.mappers.Mapper
import javax.inject.Inject

class PosterImageUiMapper @Inject constructor(
    private val metaUiMapper: Mapper<Meta, MetaUi>,
) : Mapper<PosterImage, PosterImageUi> {

    override fun toModel(model: PosterImage) = PosterImageUi(
        small = model.small,
        original = model.original,
        large = model.large,
        tiny = model.tiny,
        meta = metaUiMapper.toModel(model.meta),
        medium = model.medium
    )

    override fun fromModel(model: PosterImageUi) = PosterImage(
        small = model.small,
        original = model.original,
        large = model.large,
        tiny = model.tiny,
        meta = metaUiMapper.fromModel(model.meta),
        medium = model.medium
    )
}