package com.ren.kitsuapp.utils.mappers.dtos

import com.ren.kitsuapp.data.remote.dtos.LinksDto
import com.ren.kitsuapp.domain.models.Links
import com.ren.kitsuapp.utils.mappers.Mapper
import javax.inject.Inject

class LinksDtoMapper @Inject constructor() : Mapper<LinksDto, Links> {

    override fun toModel(model: LinksDto) = Links(
        next = model.next,
        last = model.last,
        first = model.first
    )

    override fun fromModel(model: Links) = LinksDto(
        next = model.next,
        last = model.last,
        first = model.first
    )
}