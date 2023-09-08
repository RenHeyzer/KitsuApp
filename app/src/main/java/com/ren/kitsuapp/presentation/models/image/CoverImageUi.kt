package com.ren.kitsuapp.presentation.models.image

import com.ren.kitsuapp.utils.mappers.Mappable

data class CoverImageUi(
    val small: String,
    val original: String,
    val large: String,
    val tiny: String,
    val meta: MetaUi
) : Mappable