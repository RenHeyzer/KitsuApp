package com.ren.kitsuapp.presentation.models

import com.ren.kitsuapp.domain.models.image.CoverImage
import com.ren.kitsuapp.domain.models.image.PosterImage
import com.ren.kitsuapp.domain.models.titles.Titles
import com.ren.kitsuapp.presentation.models.image.CoverImageUi
import com.ren.kitsuapp.presentation.models.image.PosterImageUi
import com.ren.kitsuapp.presentation.models.titles.TitlesUi
import com.ren.kitsuapp.utils.mappers.Mappable

data class AttributesUi(
    val endDate: String?,
    val episodeCount: Int?,
    val description: String,
    val ratingRank: Int,
    val posterImage: PosterImageUi,
    val createdAt: String,
    val subtype: String,
    val youtubeVideoId: String?,
    val averageRating: String,
    val coverImage: CoverImageUi?,
    val ratingFrequencies: RatingFrequenciesUi,
    val showType: String,
    val abbreviatedTitles: List<String>,
    val slug: String,
    val episodeLength: Int?,
    val updatedAt: String,
    val nsfw: Boolean,
    val synopsis: String,
    val titles: TitlesUi,
    val ageRating: String,
    val totalLength: Int,
    val favoritesCount: Int,
    val coverImageTopOffset: Int,
    val canonicalTitle: String,
    val tba: String?,
    val userCount: Int,
    val popularityRank: Int,
    val ageRatingGuide: String,
    val startDate: String,
    val status: String
): Mappable