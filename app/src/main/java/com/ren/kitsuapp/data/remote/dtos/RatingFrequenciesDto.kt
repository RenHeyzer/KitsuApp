package com.ren.kitsuapp.data.remote.dtos

import com.google.gson.annotations.SerializedName
import com.ren.kitsuapp.utils.mappers.Mappable

data class RatingFrequenciesDto(
    @SerializedName("2")
    val two: String,
    @SerializedName("3")
    val three: String,
    @SerializedName("4")
    val four: String,
    @SerializedName("5")
    val five: String,
    @SerializedName("6")
    val six: String,
    @SerializedName("7")
    val seven: String,
    @SerializedName("8")
    val eight: String,
    @SerializedName("9")
    val nine: String,
    @SerializedName("10")
    val ten: String,
    @SerializedName("11")
    val eleven: String,
    @SerializedName("12")
    val twelve: String,
    @SerializedName("13")
    val thirteen: String,
    @SerializedName("14")
    val fourteen: String,
    @SerializedName("15")
    val fifteen: String,
    @SerializedName("16")
    val sixteen: String,
    @SerializedName("17")
    val seventeen: String,
    @SerializedName("18")
    val eighteen: String,
    @SerializedName("19")
    val nineteen: String,
    @SerializedName("20")
    val twenty: String,
): Mappable