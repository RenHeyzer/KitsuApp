package com.ren.kitsuapp.utils.mappers.ui

import com.ren.kitsuapp.domain.models.image.CoverImage
import com.ren.kitsuapp.domain.models.image.Meta
import com.ren.kitsuapp.presentation.models.image.CoverImageUi
import com.ren.kitsuapp.presentation.models.image.MetaUi
import com.ren.kitsuapp.utils.mappers.Mapper
import javax.inject.Inject

class CoverImageUiMapper @Inject constructor(
    private val metaUiMapper: Mapper<Meta, MetaUi>
) : Mapper<CoverImage, CoverImageUi> {

    override fun toModel(model: CoverImage) = CoverImageUi(
        small = model.small,
        original = model.original,
        large = model.large,
        tiny = model.tiny,
        meta = metaUiMapper.toModel(model.meta)
    )

    override fun fromModel(model: CoverImageUi) = CoverImage(
        small = model.small,
        original = model.original,
        large = model.large,
        tiny = model.tiny,
        meta = metaUiMapper.fromModel(model.meta)
    )
}