package com.ren.kitsuapp.presentation.models

import com.ren.kitsuapp.utils.mappers.Mappable

data class KitsuResponseUi(
    val data: List<DataItemUi>,
    val meta: Meta,
    val links: LinksUi
) : Mappable {

    data class Meta(
        val count: Int
    ) : Mappable
}
