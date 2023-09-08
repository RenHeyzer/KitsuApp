package com.ren.kitsuapp.domain.models

import com.ren.kitsuapp.utils.mappers.Mappable


data class DataItem(
    val links: Links,
    val attributes: Attributes,
    val id: String,
    val type: String
): Mappable