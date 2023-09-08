package com.ren.kitsuapp.utils.mappers.ui

import com.ren.kitsuapp.domain.models.RatingFrequencies
import com.ren.kitsuapp.presentation.models.RatingFrequenciesUi
import com.ren.kitsuapp.utils.mappers.Mapper
import javax.inject.Inject

class RatingFrequenciesUiMapper @Inject constructor() : Mapper<RatingFrequencies, RatingFrequenciesUi> {

    override fun toModel(model: RatingFrequencies) = RatingFrequenciesUi(
        two = model.two,
        three = model.three,
        four = model.four,
        five = model.five,
        six = model.six,
        seven = model.seven,
        eight = model.eight,
        nine = model.nine,
        ten = model.ten,
        eleven = model.eleven,
        twelve = model.twelve,
        thirteen = model.thirteen,
        fourteen = model.fourteen,
        fifteen = model.fifteen,
        sixteen = model.sixteen,
        seventeen = model.seventeen,
        eighteen = model.eighteen,
        nineteen = model.nineteen,
        twenty = model.twenty,
    )

    override fun fromModel(model: RatingFrequenciesUi) = RatingFrequencies(
        two = model.two,
        three = model.three,
        four = model.four,
        five = model.five,
        six = model.six,
        seven = model.seven,
        eight = model.eight,
        nine = model.nine,
        ten = model.ten,
        eleven = model.eleven,
        twelve = model.twelve,
        thirteen = model.thirteen,
        fourteen = model.fourteen,
        fifteen = model.fifteen,
        sixteen = model.sixteen,
        seventeen = model.seventeen,
        eighteen = model.eighteen,
        nineteen = model.nineteen,
        twenty = model.twenty,
    )
}