package com.ren.kitsuapp.utils.mappers.dtos

import com.ren.kitsuapp.data.remote.dtos.AttributesDto
import com.ren.kitsuapp.data.remote.dtos.RatingFrequenciesDto
import com.ren.kitsuapp.data.remote.dtos.image.CoverImageDto
import com.ren.kitsuapp.data.remote.dtos.image.PosterImageDto
import com.ren.kitsuapp.data.remote.dtos.titles.TitlesDto
import com.ren.kitsuapp.domain.models.Attributes
import com.ren.kitsuapp.domain.models.RatingFrequencies
import com.ren.kitsuapp.domain.models.image.CoverImage
import com.ren.kitsuapp.domain.models.image.PosterImage
import com.ren.kitsuapp.domain.models.titles.Titles
import com.ren.kitsuapp.utils.mappers.Mapper
import javax.inject.Inject

class AttributesDtoMapper @Inject constructor(
    private val posterImageDtoMapper: Mapper<PosterImageDto, PosterImage>,
    private val coverImageDtoMapper: Mapper<CoverImageDto, CoverImage>,
    private val titlesDtoDtoMapper: Mapper<TitlesDto, Titles>,
    private val ratingFrequenciesDtoMapper: Mapper<RatingFrequenciesDto, RatingFrequencies>
) : Mapper<AttributesDto, Attributes> {

    override fun toModel(model: AttributesDto) = Attributes(
        endDate = model.endDate,
        episodeCount = model.episodeCount,
        description = model.description,
        ratingRank = model.ratingRank,
        posterImage = posterImageDtoMapper.toModel(model.posterImage),
        createdAt = model.createdAt,
        subtype = model.subtype,
        youtubeVideoId = model.youtubeVideoId,
        averageRating = model.averageRating,
        coverImage = model.coverImage?.let { coverImageDtoMapper.toModel(it) },
        ratingFrequencies = ratingFrequenciesDtoMapper.toModel(model.ratingFrequencies),
        showType = model.showType,
        abbreviatedTitles = model.abbreviatedTitles,
        slug = model.slug,
        episodeLength = model.episodeLength,
        updatedAt = model.updatedAt,
        nsfw = model.nsfw,
        synopsis = model.synopsis,
        titles = titlesDtoDtoMapper.toModel(model.titles),
        ageRating = model.ageRating,
        totalLength = model.totalLength,
        favoritesCount = model.favoritesCount,
        coverImageTopOffset = model.coverImageTopOffset,
        canonicalTitle = model.canonicalTitle,
        tba = model.tba,
        userCount = model.userCount,
        popularityRank = model.popularityRank,
        ageRatingGuide = model.ageRatingGuide,
        startDate = model.startDate,
        status = model.status
    )

    override fun fromModel(model: Attributes) = AttributesDto(
        endDate = model.endDate,
        episodeCount = model.episodeCount,
        description = model.description,
        ratingRank = model.ratingRank,
        posterImage = posterImageDtoMapper.fromModel(model.posterImage),
        createdAt = model.createdAt,
        subtype = model.subtype,
        youtubeVideoId = model.youtubeVideoId,
        averageRating = model.averageRating,
        coverImage = model.coverImage?.let { coverImageDtoMapper.fromModel(it) },
        ratingFrequencies = ratingFrequenciesDtoMapper.fromModel(model.ratingFrequencies),
        showType = model.showType,
        abbreviatedTitles = model.abbreviatedTitles,
        slug = model.slug,
        episodeLength = model.episodeLength,
        updatedAt = model.updatedAt,
        nsfw = model.nsfw,
        synopsis = model.synopsis,
        titles = titlesDtoDtoMapper.fromModel(model.titles),
        ageRating = model.ageRating,
        totalLength = model.totalLength,
        favoritesCount = model.favoritesCount,
        coverImageTopOffset = model.coverImageTopOffset,
        canonicalTitle = model.canonicalTitle,
        tba = model.tba,
        userCount = model.userCount,
        popularityRank = model.popularityRank,
        ageRatingGuide = model.ageRatingGuide,
        startDate = model.startDate,
        status = model.status
    )
}