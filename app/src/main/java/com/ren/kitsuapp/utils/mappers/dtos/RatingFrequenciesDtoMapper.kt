package com.ren.kitsuapp.utils.mappers.dtos

import com.ren.kitsuapp.data.remote.dtos.RatingFrequenciesDto
import com.ren.kitsuapp.domain.models.RatingFrequencies
import com.ren.kitsuapp.utils.mappers.Mapper
import javax.inject.Inject

class RatingFrequenciesDtoMapper @Inject constructor() : Mapper<RatingFrequenciesDto, RatingFrequencies> {

    override fun toModel(model: RatingFrequenciesDto) = RatingFrequencies(
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

    override fun fromModel(model: RatingFrequencies) = RatingFrequenciesDto(
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