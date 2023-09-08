package com.ren.kitsuapp.data.remote.dtos

import com.google.gson.annotations.SerializedName
import com.ren.kitsuapp.utils.mappers.Mappable

data class DataItemDto(
    @SerializedName("links")
    val links: LinksDto,
    @SerializedName("attributes")
    val attributes: AttributesDto,
    @SerializedName("id")
    val id: String,
    @SerializedName("type")
    val type: String
): Mappable