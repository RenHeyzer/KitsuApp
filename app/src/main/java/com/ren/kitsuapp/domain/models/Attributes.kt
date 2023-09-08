package com.ren.kitsuapp.domain.models

import com.ren.kitsuapp.domain.models.image.CoverImage
import com.ren.kitsuapp.domain.models.image.PosterImage
import com.ren.kitsuapp.domain.models.titles.Titles
import com.ren.kitsuapp.utils.mappers.Mappable

data class Attributes(
    val endDate: String?,
    val episodeCount: Int?,
    val description: String,
    val ratingRank: Int,
    val posterImage: PosterImage,
    val createdAt: String,
    val subtype: String,
    val youtubeVideoId: String?,
    val averageRating: String,
    val coverImage: CoverImage?,
    val ratingFrequencies: RatingFrequencies,
    val showType: String,
    val abbreviatedTitles: List<String>,
    val slug: String,
    val episodeLength: Int?,
    val updatedAt: String,
    val nsfw: Boolean,
    val synopsis: String,
    val titles: Titles,
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