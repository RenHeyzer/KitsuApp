package com.ren.kitsuapp.domain.usecases

import com.ren.kitsuapp.domain.base.None
import com.ren.kitsuapp.domain.either.Either
import com.ren.kitsuapp.domain.models.Attributes
import com.ren.kitsuapp.domain.models.DataItem
import com.ren.kitsuapp.domain.models.KitsuResponse
import com.ren.kitsuapp.domain.models.Links
import com.ren.kitsuapp.domain.models.RatingFrequencies
import com.ren.kitsuapp.domain.models.image.CoverImage
import com.ren.kitsuapp.domain.models.image.Dimensions
import com.ren.kitsuapp.domain.models.image.Meta
import com.ren.kitsuapp.domain.models.image.PosterImage
import com.ren.kitsuapp.domain.models.titles.Titles
import com.ren.kitsuapp.domain.repositories.AnimeRepository
import com.ren.kitsuapp.utils.dispatchers.AppDispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.mockito.Mockito
import org.mockito.kotlin.mock

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FetchAnimeUseCaseTest {

    val testAnimeRepository = mock<AnimeRepository>()

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `test if a valid anime list is coming`() = runTest {
        val dispatchersDefault = StandardTestDispatcher(testScheduler)
        val dispatcherIO = StandardTestDispatcher(testScheduler)
        val dispatcherUnconfined = UnconfinedTestDispatcher(testScheduler)

        val appDispatchers = AppDispatchers(
            default = dispatchersDefault,
            io = dispatcherIO,
            unconfined = dispatcherUnconfined
        )

        val response = KitsuResponse(
            data = listOf(
                DataItem(
                    links = Links("next", "last", "first"),
                    attributes = Attributes(
                        endDate = "1999-04-24",
                        episodeCount = 26,
                        description = "Test description",
                        ratingRank = 224,
                        posterImage = PosterImage(
                            small = "https://media.kitsu.io/anime/poster_images/1/small.jpg",
                            original = "https://media.kitsu.io/anime/poster_images/1/original.jpg",
                            large = "https://media.kitsu.io/anime/poster_images/1/large.jpg",
                            tiny = "https://media.kitsu.io/anime/poster_images/1/tiny.jpg",
                            meta = Meta(
                                Dimensions(
                                    tiny = Dimensions.Tiny(110, 156),
                                    large = Dimensions.Large(550, 780),
                                    small = Dimensions.Small(284, 402),
                                    medium = Dimensions.Medium(390, 554)
                                )
                            ),
                            medium = "https://media.kitsu.io/anime/poster_images/1/medium.jpg"
                        ),
                        createdAt = "2013-02-20T16:00:16.085Z",
                        subtype = "movie",
                        youtubeVideoId = "hc7IxJ93jtM",
                        averageRating = "81.95",
                        coverImage = CoverImage(
                            tiny = "https://media.kitsu.io/anime/1/cover_image/tiny-1f92cfe65c1b31d8b47e36f025d32b35.jpeg",
                            large = "https://media.kitsu.io/anime/1/cover_image/large-88da0208ac7fdd1a978de8b539008bd8.jpeg",
                            small = "https://media.kitsu.io/anime/1/cover_image/small-33ff2ab0f599bc15ed73856ecd13fe71.jpeg",
                            original = "https://media.kitsu.io/anime/1/cover_image/fb57e5f25616633a41f0f5f1ded938ee.jpeg",
                            meta = Meta(
                                Dimensions(
                                    tiny = Dimensions.Tiny(110, 156),
                                    large = Dimensions.Large(550, 780),
                                    small = Dimensions.Small(284, 402),
                                    medium = Dimensions.Medium(390, 554)
                                )
                            ),
                        ),
                        ratingFrequencies = RatingFrequencies(
                            "2",
                            "3",
                            "4",
                            "5",
                            "6",
                            "7",
                            "8",
                            "9",
                            "10",
                            "11",
                            "12",
                            "13",
                            "14",
                            "15",
                            "16",
                            "17",
                            "18",
                            "19",
                            "20"
                        ),
                        showType = "TV",
                        abbreviatedTitles = listOf("COWBOY BEBOP"),
                        slug = "cowboy-bebop-tengoku-no-tobira",
                        episodeLength = 25,
                        updatedAt = "2023-08-22T12:00:10.345Z",
                        nsfw = false,
                        synopsis = "test synopsis",
                        titles = Titles(
                            en = "Cowboy Bebop: The Movie",
                            enJp = "Cowboy Bebop: Tengoku no Tobira",
                            jaJp = "カウボーイビバップ天国の扉"
                        ),
                        ageRating = "R",
                        totalLength = 626,
                        favoritesCount = 321,
                        coverImageTopOffset = 400,
                        canonicalTitle = "Cowboy Bebop",
                        tba = null,
                        userCount = 40421,
                        popularityRank = 344,
                        ageRatingGuide = "17+ (violence & profanity)",
                        startDate = "2001-09-01",
                        status = "finished"
                    ),
                    id = "1",
                    type = "anime"
                )
            ),
            meta = KitsuResponse.Meta(19472),
            links = Links(
                first = "https://kitsu.io/api/edge/anime?page%5Blimit%5D=10&page%5Boffset%5D=0",
                next = "https://kitsu.io/api/edge/anime?page%5Blimit%5D=10&page%5Boffset%5D=10",
                last = "https://kitsu.io/api/edge/anime?page%5Blimit%5D=10&page%5Boffset%5D=19462"
            )
        )

        Mockito.`when`(testAnimeRepository.fetchAnime())
            .thenReturn(
                flowOf<Either<String, KitsuResponse>>(
                    Either.Right(response)
                )
            )

        val useCase = FetchAnimeUseCaseImpl(
            animeRepository = testAnimeRepository,
            appDispatchers = appDispatchers
        )
        useCase(None())
        advanceUntilIdle()

        val actual = useCase.receiveChannel.receive()
        val expected = Either.Right(
            KitsuResponse(
                data = listOf(
                    DataItem(
                        links = Links("next", "last", "first"),
                        attributes = Attributes(
                            endDate = "1999-04-24",
                            episodeCount = 26,
                            description = "Test description",
                            ratingRank = 224,
                            posterImage = PosterImage(
                                small = "https://media.kitsu.io/anime/poster_images/1/small.jpg",
                                original = "https://media.kitsu.io/anime/poster_images/1/original.jpg",
                                large = "https://media.kitsu.io/anime/poster_images/1/large.jpg",
                                tiny = "https://media.kitsu.io/anime/poster_images/1/tiny.jpg",
                                meta = Meta(
                                    Dimensions(
                                        tiny = Dimensions.Tiny(110, 156),
                                        large = Dimensions.Large(550, 780),
                                        small = Dimensions.Small(284, 402),
                                        medium = Dimensions.Medium(390, 554)
                                    )
                                ),
                                medium = "https://media.kitsu.io/anime/poster_images/1/medium.jpg"
                            ),
                            createdAt = "2013-02-20T16:00:16.085Z",
                            subtype = "movie",
                            youtubeVideoId = "hc7IxJ93jtM",
                            averageRating = "81.95",
                            coverImage = CoverImage(
                                tiny = "https://media.kitsu.io/anime/1/cover_image/tiny-1f92cfe65c1b31d8b47e36f025d32b35.jpeg",
                                large = "https://media.kitsu.io/anime/1/cover_image/large-88da0208ac7fdd1a978de8b539008bd8.jpeg",
                                small = "https://media.kitsu.io/anime/1/cover_image/small-33ff2ab0f599bc15ed73856ecd13fe71.jpeg",
                                original = "https://media.kitsu.io/anime/1/cover_image/fb57e5f25616633a41f0f5f1ded938ee.jpeg",
                                meta = Meta(
                                    Dimensions(
                                        tiny = Dimensions.Tiny(110, 156),
                                        large = Dimensions.Large(550, 780),
                                        small = Dimensions.Small(284, 402),
                                        medium = Dimensions.Medium(390, 554)
                                    )
                                ),
                            ),
                            ratingFrequencies = RatingFrequencies(
                                "2",
                                "3",
                                "4",
                                "5",
                                "6",
                                "7",
                                "8",
                                "9",
                                "10",
                                "11",
                                "12",
                                "13",
                                "14",
                                "15",
                                "16",
                                "17",
                                "18",
                                "19",
                                "20"
                            ),
                            showType = "TV",
                            abbreviatedTitles = listOf("COWBOY BEBOP"),
                            slug = "cowboy-bebop-tengoku-no-tobira",
                            episodeLength = 25,
                            updatedAt = "2023-08-22T12:00:10.345Z",
                            nsfw = false,
                            synopsis = "test synopsis",
                            titles = Titles(
                                en = "Cowboy Bebop: The Movie",
                                enJp = "Cowboy Bebop: Tengoku no Tobira",
                                jaJp = "カウボーイビバップ天国の扉"
                            ),
                            ageRating = "R",
                            totalLength = 626,
                            favoritesCount = 321,
                            coverImageTopOffset = 400,
                            canonicalTitle = "Cowboy Bebop",
                            tba = null,
                            userCount = 40421,
                            popularityRank = 344,
                            ageRatingGuide = "17+ (violence & profanity)",
                            startDate = "2001-09-01",
                            status = "finished"
                        ),
                        id = "1",
                        type = "anime"
                    )
                ),
                meta = KitsuResponse.Meta(19472),
                links = Links(
                    first = "https://kitsu.io/api/edge/anime?page%5Blimit%5D=10&page%5Boffset%5D=0",
                    next = "https://kitsu.io/api/edge/anime?page%5Blimit%5D=10&page%5Boffset%5D=10",
                    last = "https://kitsu.io/api/edge/anime?page%5Blimit%5D=10&page%5Boffset%5D=19462"
                )
            )
        )
        Assertions.assertEquals(expected, actual)
    }


    @AfterAll
    fun tearDown() {
        Mockito.reset(testAnimeRepository)
    }
}