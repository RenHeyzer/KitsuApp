package com.ren.kitsuapp.presentation.models.titles

import com.ren.kitsuapp.utils.mappers.Mappable


data class TitlesUi(
    val en: String?,
    val jaJp: String,
    val enJp: String
): Mappable