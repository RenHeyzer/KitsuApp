package com.ren.kitsuapp.domain.models.image

import com.ren.kitsuapp.utils.mappers.Mappable

data class Dimensions(
    val tiny: Tiny,
    val large: Large,
    val small: Small,
    val medium: Medium?
): Mappable {

    data class Tiny(
        val width: Int?,
        val height: Int?
    ): Mappable

    data class Large(
        val width: Int?,
        val height: Int?
    ): Mappable

    data class Small(
        val width: Int?,
        val height: Int?
    ): Mappable

    data class Medium(
        val width: Int?,
        val height: Int?
    ): Mappable
}