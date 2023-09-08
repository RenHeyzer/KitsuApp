package com.ren.kitsuapp.utils.mappers.ui

import com.ren.kitsuapp.domain.models.titles.Titles
import com.ren.kitsuapp.presentation.models.titles.TitlesUi
import com.ren.kitsuapp.utils.mappers.Mapper
import javax.inject.Inject

class TitlesUiMapper @Inject constructor() : Mapper<Titles, TitlesUi> {

    override fun toModel(model: Titles) = TitlesUi(
        en = model.en,
        enJp = model.enJp,
        jaJp = model.jaJp
    )

    override fun fromModel(model: TitlesUi) = Titles(
        en = model.en,
        enJp = model.enJp,
        jaJp = model.jaJp
    )
}