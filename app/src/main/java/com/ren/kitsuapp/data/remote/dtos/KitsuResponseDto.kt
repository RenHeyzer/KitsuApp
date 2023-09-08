package com.ren.kitsuapp.data.remote.dtos

import com.google.gson.annotations.SerializedName
import com.ren.kitsuapp.utils.mappers.Mappable

data class KitsuResponseDto(
    @SerializedName("data")
    val data: List<DataItemDto>,
    @SerializedName("meta")
    val meta: Meta,
    @SerializedName("links")
    val links: LinksDto
): Mappable {

    data class Meta(
        @SerializedName("count")
        val count: Int
    ): Mappable
}
