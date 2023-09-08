package com.ren.kitsuapp.data.remote.dtos

import com.google.gson.annotations.SerializedName
import com.ren.kitsuapp.data.remote.dtos.image.CoverImageDto
import com.ren.kitsuapp.data.remote.dtos.image.PosterImageDto
import com.ren.kitsuapp.data.remote.dtos.titles.TitlesDto
import com.ren.kitsuapp.utils.mappers.Mappable

data class AttributesDto(
    @SerializedName("endDate")
    val endDate: String?,
    @SerializedName("episodeCount")
    val episodeCount: Int?,
    @SerializedName("description")
    val description: String,
    @SerializedName("ratingRank")
    val ratingRank: Int,
    @SerializedName("posterImage")
    val posterImage: PosterImageDto,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("subtype")
    val subtype: String,
    @SerializedName("youtubeVideoId")
    val youtubeVideoId: String?,
    @SerializedName("averageRating")
    val averageRating: String,
    @SerializedName("coverImage")
    val coverImage: CoverImageDto?,
    @SerializedName("ratingFrequencies")
    val ratingFrequencies: RatingFrequenciesDto,
    @SerializedName("showType")
    val showType: String,
    @SerializedName("abbreviatedTitles")
    val abbreviatedTitles: List<String>,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("episodeLength")
    val episodeLength: Int?,
    @SerializedName("updatedAt")
    val updatedAt: String,
    @SerializedName("nsfw")
    val nsfw: Boolean,
    @SerializedName("synopsis")
    val synopsis: String,
    @SerializedName("titles")
    val titles: TitlesDto,
    @SerializedName("ageRating")
    val ageRating: String,
    @SerializedName("totalLength")
    val totalLength: Int,
    @SerializedName("favoritesCount")
    val favoritesCount: Int,
    @SerializedName("coverImageTopOffset")
    val coverImageTopOffset: Int,
    @SerializedName("canonicalTitle")
    val canonicalTitle: String,
    @SerializedName("tba")
    val tba: String?,
    @SerializedName("userCount")
    val userCount: Int,
    @SerializedName("popularityRank")
    val popularityRank: Int,
    @SerializedName("ageRatingGuide")
    val ageRatingGuide: String,
    @SerializedName("startDate")
    val startDate: String,
    @SerializedName("status")
    val status: String
): Mappable