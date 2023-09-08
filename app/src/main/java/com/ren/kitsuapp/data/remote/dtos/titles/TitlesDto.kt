package com.ren.kitsuapp.data.remote.dtos.titles

import com.google.gson.annotations.SerializedName
import com.ren.kitsuapp.utils.mappers.Mappable

data class TitlesDto(
    @SerializedName("en")
    val en: String?,
    @SerializedName("ja_jp")
    val jaJp: String,
    @SerializedName("en_jp")
    val enJp: String
) : Mappable