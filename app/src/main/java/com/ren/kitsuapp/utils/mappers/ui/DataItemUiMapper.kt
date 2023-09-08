package com.ren.kitsuapp.utils.mappers.ui

import com.ren.kitsuapp.domain.models.Attributes
import com.ren.kitsuapp.domain.models.DataItem
import com.ren.kitsuapp.domain.models.Links
import com.ren.kitsuapp.presentation.models.AttributesUi
import com.ren.kitsuapp.presentation.models.DataItemUi
import com.ren.kitsuapp.presentation.models.LinksUi
import com.ren.kitsuapp.utils.mappers.Mapper
import javax.inject.Inject

class DataItemUiMapper @Inject constructor(
    private val linksUiMapper: Mapper<Links, LinksUi>,
    private val attributesUiMapper: Mapper<Attributes, AttributesUi>
) : Mapper<DataItem, DataItemUi> {

    override fun toModel(model: DataItem) = DataItemUi(
        links = linksUiMapper.toModel(model.links),
        id = model.id,
        attributes = attributesUiMapper.toModel(model.attributes),
        type = model.type
    )


    override fun fromModel(model: DataItemUi) = DataItem(
        links = linksUiMapper.fromModel(model.links),
        id = model.id,
        attributes = attributesUiMapper.fromModel(model.attributes),
        type = model.type
    )
}