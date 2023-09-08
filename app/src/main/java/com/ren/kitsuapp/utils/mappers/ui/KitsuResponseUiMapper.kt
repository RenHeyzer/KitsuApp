package com.ren.kitsuapp.utils.mappers.ui

import com.ren.kitsuapp.domain.models.DataItem
import com.ren.kitsuapp.domain.models.KitsuResponse
import com.ren.kitsuapp.domain.models.Links
import com.ren.kitsuapp.presentation.models.DataItemUi
import com.ren.kitsuapp.presentation.models.KitsuResponseUi
import com.ren.kitsuapp.presentation.models.LinksUi
import com.ren.kitsuapp.utils.mappers.Mapper
import javax.inject.Inject

class KitsuResponseUiMapper @Inject constructor(
    private val dataItemUiMapper: Mapper<DataItem, DataItemUi>,
    private val metaUiMapper: Mapper<KitsuResponse.Meta, KitsuResponseUi.Meta>,
    private val linksUiMapper: Mapper<Links, LinksUi>
) : Mapper<KitsuResponse, KitsuResponseUi> {

    override fun toModel(model: KitsuResponse) = KitsuResponseUi(
        data = model.data.map {
            dataItemUiMapper.toModel(it)
        },
        meta = metaUiMapper.toModel(model.meta),
        links = linksUiMapper.toModel(model.links)
    )

    override fun fromModel(model: KitsuResponseUi) = KitsuResponse(
        data = model.data.map {
            dataItemUiMapper.fromModel(it)
        },
        meta = metaUiMapper.fromModel(model.meta),
        links = linksUiMapper.fromModel(model.links)
    )

    class MetaUiMapper @Inject constructor() : Mapper<KitsuResponse.Meta, KitsuResponseUi.Meta> {

        override fun toModel(model: KitsuResponse.Meta) = KitsuResponseUi.Meta(
            model.count
        )

        override fun fromModel(model: KitsuResponseUi.Meta) = KitsuResponse.Meta(
            model.count
        )
    }
}