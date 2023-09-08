package com.ren.kitsuapp.data.remote.dtos.image

import com.google.gson.annotations.SerializedName
import com.ren.kitsuapp.utils.mappers.Mappable

data class PosterImageDto(
    @SerializedName("small")
    val small: String,
    @SerializedName("original")
    val original: String,
    @SerializedName("large")
    val large: String,
    @SerializedName("tiny")
    val tiny: String,
    @SerializedName("meta")
    val meta: MetaDto,
    @SerializedName("medium")
    val medium: String
): Mappable