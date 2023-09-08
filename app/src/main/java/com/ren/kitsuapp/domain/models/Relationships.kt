package com.ren.kitsuapp.domain.models


data class Relationships(
    val animeCharacters: AnimeCharacters,
    val animeProductions: AnimeProductions,
    val staff: Staff,
    val streamingLinks: StreamingLinks,
    val quotes: Quotes,
    val characters: Characters,
    val castings: Castings,
    val mappings: Mappings,
    val animeStaff: AnimeStaff,
    val reviews: Reviews,
    val installments: Installments,
    val genres: Genres,
    val mediaRelationships: MediaRelationships,
    val categories: Categories,
    val productions: Productions,
    val episodes: Episodes
) {

    data class AnimeCharacters(
        val links: Links
    )

    data class AnimeProductions(
        val links: Links
    )

    data class Staff(
        val links: Links
    )

    data class StreamingLinks(
        val links: Links
    )

    data class Quotes(
        val links: Links
    )

    data class Characters(
        val links: Links
    )

    data class Castings(
        val links: Links
    )

    data class Mappings(
        val links: Links
    )

    data class AnimeStaff(
        val links: Links
    )

    data class Reviews(
        val links: Links
    )

    data class Installments(
        val links: Links
    )

    data class Genres(
        val links: Links
    )

    data class MediaRelationships(
        val links: Links
    )

    data class Categories(
        val links: Links
    )

    data class Productions(
        val links: Links
    )

    data class Episodes(
        val links: Links
    )
}