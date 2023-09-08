package com.ren.kitsuapp.presentation.models

import com.ren.kitsuapp.utils.mappers.Mappable


data class DataItemUi(
    val links: LinksUi,
    val attributes: AttributesUi,
    val id: String,
    val type: String
): Mappable