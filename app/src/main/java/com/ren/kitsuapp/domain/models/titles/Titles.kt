package com.ren.kitsuapp.domain.models.titles

import com.ren.kitsuapp.utils.mappers.Mappable


data class Titles(
    val en: String?,
    val jaJp: String,
    val enJp: String
): Mappable