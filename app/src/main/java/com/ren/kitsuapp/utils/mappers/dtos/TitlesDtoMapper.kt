package com.ren.kitsuapp.utils.mappers.dtos

import com.ren.kitsuapp.data.remote.dtos.titles.TitlesDto
import com.ren.kitsuapp.domain.models.titles.Titles
import com.ren.kitsuapp.utils.mappers.Mapper
import javax.inject.Inject

class TitlesDtoMapper @Inject constructor() : Mapper<TitlesDto, Titles> {

    override fun toModel(model: TitlesDto) = Titles(
        en = model.en,
        enJp = model.enJp,
        jaJp = model.jaJp
    )

    override fun fromModel(model: Titles) = TitlesDto(
        en = model.en,
        enJp = model.enJp,
        jaJp = model.jaJp
    )
}