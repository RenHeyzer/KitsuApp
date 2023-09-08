package com.ren.kitsuapp.utils.mappers

interface Mapper<F : Mappable, T : Mappable> {

    fun toModel(model: F): T

    fun fromModel(model: T): F
}

interface Mappable