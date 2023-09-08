package com.ren.kitsuapp.domain.models.image

import com.ren.kitsuapp.utils.mappers.Mappable

data class PosterImage(
    val small: String,
    val original: String,
    val large: String,
    val tiny: String,
    val meta: Meta,
    val medium: String
): Mappable