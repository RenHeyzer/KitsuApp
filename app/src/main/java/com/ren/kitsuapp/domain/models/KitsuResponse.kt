package com.ren.kitsuapp.domain.models

import com.ren.kitsuapp.utils.mappers.Mappable

data class KitsuResponse(
    val data: List<DataItem>,
    val meta: Meta,
    val links: Links
): Mappable {

    data class Meta(
        val count: Int
    ): Mappable
}
