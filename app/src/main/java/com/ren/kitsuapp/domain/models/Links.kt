package com.ren.kitsuapp.domain.models

import com.ren.kitsuapp.utils.mappers.Mappable

data class Links(
    val next: String?,
    val last: String?,
    val first: String?
): Mappable