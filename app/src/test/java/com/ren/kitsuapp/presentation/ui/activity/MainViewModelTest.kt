package com.ren.kitsuapp.presentation.ui.activity

import com.ren.kitsuapp.domain.models.KitsuResponse
import com.ren.kitsuapp.domain.usecases.FetchAnimeUseCaseImpl
import com.ren.kitsuapp.presentation.models.KitsuResponseUi
import com.ren.kitsuapp.utils.mappers.Mapper
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.kotlin.mock

class MainViewModelTest {

    val testFetchAnimeUseCase = mock<FetchAnimeUseCaseImpl>()
    val testKitsuResponseUiMapper = mock<Mapper<KitsuResponse, KitsuResponseUi>>()

    @AfterEach
    fun afterEach() {
        Mockito.reset(testFetchAnimeUseCase)
        Mockito.reset(testKitsuResponseUiMapper)
    }

    @BeforeEach
    fun beforeEach() {

    }

    @Test
    fun `test anime fetched and saved`() {
        val viewModel = MainViewModel(
            fetchAnimeUseCase = testFetchAnimeUseCase,
            kitsuResponseUiMapper = testKitsuResponseUiMapper
        )

        viewModel.fetchAnime()

        val expected = 
        val actual = viewModel.animeUiState.value
    }
}