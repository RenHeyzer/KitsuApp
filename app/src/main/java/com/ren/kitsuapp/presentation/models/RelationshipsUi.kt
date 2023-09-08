package com.ren.kitsuapp.presentation.models


data class RelationshipsUi(
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
        val links: LinksUi
    )

    data class AnimeProductions(
        val links: LinksUi
    )

    data class Staff(
        val links: LinksUi
    )

    data class StreamingLinks(
        val links: LinksUi
    )

    data class Quotes(
        val links: LinksUi
    )

    data class Characters(
        val links: LinksUi
    )

    data class Castings(
        val links: LinksUi
    )

    data class Mappings(
        val links: LinksUi
    )

    data class AnimeStaff(
        val links: LinksUi
    )

    data class Reviews(
        val links: LinksUi
    )

    data class Installments(
        val links: LinksUi
    )

    data class Genres(
        val links: LinksUi
    )

    data class MediaRelationships(
        val links: LinksUi
    )

    data class Categories(
        val links: LinksUi
    )

    data class Productions(
        val links: LinksUi
    )

    data class Episodes(
        val links: LinksUi
    )
}