package com.ren.kitsuapp.presentation.models

import com.ren.kitsuapp.utils.mappers.Mappable

data class LinksUi(
    val next: String?,
    val last: String?,
    val first: String?
): Mappable