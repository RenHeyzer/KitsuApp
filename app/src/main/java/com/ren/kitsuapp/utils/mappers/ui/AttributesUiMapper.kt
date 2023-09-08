package com.ren.kitsuapp.utils.mappers.ui

import com.ren.kitsuapp.domain.models.Attributes
import com.ren.kitsuapp.domain.models.RatingFrequencies
import com.ren.kitsuapp.domain.models.image.CoverImage
import com.ren.kitsuapp.domain.models.image.PosterImage
import com.ren.kitsuapp.domain.models.titles.Titles
import com.ren.kitsuapp.presentation.models.AttributesUi
import com.ren.kitsuapp.presentation.models.RatingFrequenciesUi
import com.ren.kitsuapp.presentation.models.image.CoverImageUi
import com.ren.kitsuapp.presentation.models.image.PosterImageUi
import com.ren.kitsuapp.presentation.models.titles.TitlesUi
import com.ren.kitsuapp.utils.mappers.Mapper
import javax.inject.Inject

class AttributesUiMapper @Inject constructor(
    private val posterImageUiMapper: Mapper<PosterImage, PosterImageUi>,
    private val coverImageUiMapper: Mapper<CoverImage, CoverImageUi>,
    private val titlesUiMapper: Mapper<Titles, TitlesUi>,
    private val ratingFrequenciesUiMapper: Mapper<RatingFrequencies, RatingFrequenciesUi>
) : Mapper<Attributes, AttributesUi> {

    override fun toModel(model: Attributes) = AttributesUi(
        endDate = model.endDate,
        episodeCount = model.episodeCount,
        description = model.description,
        ratingRank = model.ratingRank,
        posterImage = posterImageUiMapper.toModel(model.posterImage),
        createdAt = model.createdAt,
        subtype = model.subtype,
        youtubeVideoId = model.youtubeVideoId,
        averageRating = model.averageRating,
        coverImage = model.coverImage?.let { coverImageUiMapper.toModel(it) },
        ratingFrequencies = ratingFrequenciesUiMapper.toModel(model.ratingFrequencies),
        showType = model.showType,
        abbreviatedTitles = model.abbreviatedTitles,
        slug = model.slug,
        episodeLength = model.episodeLength,
        updatedAt = model.updatedAt,
        nsfw = model.nsfw,
        synopsis = model.synopsis,
        titles = titlesUiMapper.toModel(model.titles),
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

    override fun fromModel(model: AttributesUi) = Attributes(
        endDate = model.endDate,
        episodeCount = model.episodeCount,
        description = model.description,
        ratingRank = model.ratingRank,
        posterImage = posterImageUiMapper.fromModel(model.posterImage),
        createdAt = model.createdAt,
        subtype = model.subtype,
        youtubeVideoId = model.youtubeVideoId,
        averageRating = model.averageRating,
        coverImage = model.coverImage?.let { coverImageUiMapper.fromModel(it) },
        ratingFrequencies = ratingFrequenciesUiMapper.fromModel(model.ratingFrequencies),
        showType = model.showType,
        abbreviatedTitles = model.abbreviatedTitles,
        slug = model.slug,
        episodeLength = model.episodeLength,
        updatedAt = model.updatedAt,
        nsfw = model.nsfw,
        synopsis = model.synopsis,
        titles = titlesUiMapper.fromModel(model.titles),
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