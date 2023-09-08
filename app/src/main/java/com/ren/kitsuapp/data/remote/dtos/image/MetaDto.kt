package com.ren.kitsuapp.data.remote.dtos.image

import com.google.gson.annotations.SerializedName
import com.ren.kitsuapp.utils.mappers.Mappable

data class MetaDto(
    @SerializedName("dimensions")
    val dimensions: DimensionsDto
): Mappable