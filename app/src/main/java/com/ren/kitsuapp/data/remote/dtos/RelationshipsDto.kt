package com.ren.kitsuapp.data.remote.dtos

import com.google.gson.annotations.SerializedName
import com.ren.kitsuapp.utils.mappers.Mappable

data class RelationshipsDto(
    @SerializedName("animeCharacters")
    val animeCharacters: AnimeCharacters,
    @SerializedName("animeProductions")
    val animeProductions: AnimeProductions,
    @SerializedName("staff")
    val staff: Staff,
    @SerializedName("streamingLinks")
    val streamingLinks: StreamingLinks,
    @SerializedName("quotes")
    val quotes: Quotes,
    @SerializedName("characters")
    val characters: Characters,
    @SerializedName("castings")
    val castings: Castings,
    @SerializedName("mappings")
    val mappings: Mappings,
    @SerializedName("animeStaff")
    val animeStaff: AnimeStaff,
    @SerializedName("reviews")
    val reviews: Reviews,
    @SerializedName("installments")
    val installments: Installments,
    @SerializedName("genres")
    val genres: Genres,
    @SerializedName("mediaRelationships")
    val mediaRelationships: MediaRelationships,
    @SerializedName("categories")
    val categories: Categories,
    @SerializedName("productions")
    val productions: Productions,
    @SerializedName("episodes")
    val episodes: Episodes
): Mappable {

    data class AnimeCharacters(
        @SerializedName("links")
        val links: LinksDto
    )

    data class AnimeProductions(
        @SerializedName("links")
        val links: LinksDto
    )

    data class Staff(
        @SerializedName("links")
        val links: LinksDto
    )

    data class StreamingLinks(
        @SerializedName("links")
        val links: LinksDto
    )

    data class Quotes(
        @SerializedName("links")
        val links: LinksDto
    )

    data class Characters(
        @SerializedName("links")
        val links: LinksDto
    )

    data class Castings(
        @SerializedName("links")
        val links: LinksDto
    )

    data class Mappings(
        @SerializedName("links")
        val links: LinksDto
    )

    data class AnimeStaff(
        @SerializedName("links")
        val links: LinksDto
    )

    data class Reviews(
        @SerializedName("links")
        val links: LinksDto
    )

    data class Installments(
        @SerializedName("links")
        val links: LinksDto
    )

    data class Genres(
        @SerializedName("links")
        val links: LinksDto
    )

    data class MediaRelationships(
        @SerializedName("links")
        val links: LinksDto
    )

    data class Categories(
        @SerializedName("links")
        val links: LinksDto
    )

    data class Productions(
        @SerializedName("links")
        val links: LinksDto
    )

    data class Episodes(
        @SerializedName("links")
        val links: LinksDto
    )
}