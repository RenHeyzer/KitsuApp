package com.ren.kitsuapp.data.remote.dtos

import com.google.gson.annotations.SerializedName
import com.ren.kitsuapp.utils.mappers.Mappable

data class LinksDto(
    @SerializedName("next")
    val next: String?,
    @SerializedName("last")
    val last: String?,
    @SerializedName("first")
    val first: String?
): Mappable