package com.ren.kitsuapp.utils.mappers.ui

import com.ren.kitsuapp.domain.models.image.Meta
import com.ren.kitsuapp.presentation.models.image.MetaUi
import com.ren.kitsuapp.utils.mappers.Mapper
import javax.inject.Inject

class MetaUiMapper @Inject constructor(
    private val dimensionsUiMapper: DimensionsUiMapper
) : Mapper<Meta, MetaUi> {

    override fun toModel(model: Meta) = MetaUi(
        dimensionsUiMapper.toModel(model.dimensions)
    )

    override fun fromModel(model: MetaUi) = Meta(
        dimensionsUiMapper.fromModel(model.dimensions)
    )
}