package com.ren.kitsuapp.utils.mappers.ui

import com.ren.kitsuapp.domain.models.Links
import com.ren.kitsuapp.presentation.models.LinksUi
import com.ren.kitsuapp.utils.mappers.Mapper
import javax.inject.Inject

class LinksUiMapper @Inject constructor() : Mapper<Links, LinksUi> {

    override fun toModel(model: Links) = LinksUi(
        next = model.next,
        last = model.last,
        first = model.first
    )

    override fun fromModel(model: LinksUi) = Links(
        next = model.next,
        last = model.last,
        first = model.first
    )
}