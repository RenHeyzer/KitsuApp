package com.ren.kitsuapp.data.remote.dtos.image

import com.google.gson.annotations.SerializedName
import com.ren.kitsuapp.utils.mappers.Mappable

data class DimensionsDto(
    @SerializedName("tiny")
    val tiny: Tiny,
    @SerializedName("large")
    val large: Large,
    @SerializedName("small")
    val small: Small,
    @SerializedName("medium")
    val medium: Medium?
): Mappable {

    data class Tiny(
        @SerializedName("width")
        val width: Int?,
        @SerializedName("height")
        val height: Int?
    ): Mappable

    data class Large(
        @SerializedName("width")
        val width: Int?,
        @SerializedName("height")
        val height: Int?
    ): Mappable

    data class Small(
        @SerializedName("width")
        val width: Int?,
        @SerializedName("height")
        val height: Int?
    ): Mappable

    data class Medium(
        @SerializedName("width")
        val width: Int?,
        @SerializedName("height")
        val height: Int?
    ): Mappable
}