package com.ren.kitsuapp.presentation.models.image

import com.ren.kitsuapp.utils.mappers.Mappable

data class PosterImageUi(
    val small: String,
    val original: String,
    val large: String,
    val tiny: String,
    val meta: MetaUi,
    val medium: String
): Mappable