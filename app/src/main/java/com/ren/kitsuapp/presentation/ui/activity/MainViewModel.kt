package com.ren.kitsuapp.presentation.ui.activity

import androidx.lifecycle.viewModelScope
import com.ren.kitsuapp.domain.base.None
import com.ren.kitsuapp.domain.models.KitsuResponse
import com.ren.kitsuapp.domain.usecases.FetchAnimeUseCaseImpl
import com.ren.kitsuapp.presentation.base.BaseViewModel
import com.ren.kitsuapp.presentation.models.KitsuResponseUi
import com.ren.kitsuapp.presentation.state.UIState
import com.ren.kitsuapp.utils.mappers.Mapper
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val fetchAnimeUseCase: FetchAnimeUseCaseImpl,
    private val kitsuResponseUiMapper: Mapper<KitsuResponse, KitsuResponseUi>
) : BaseViewModel() {

    private val animeReceiveChannel get() = fetchAnimeUseCase.receiveChannel

    private val _animeUiState = MutableStateFlow<UIState<KitsuResponseUi>>(UIState.Loading())
    val animeUiState = _animeUiState.asStateFlow()

    init {
        fetchAnimeUseCase(None())
        fetchAnime()
    }

    override fun onCleared() {
        super.onCleared()
        fetchAnimeUseCase.clear()
        animeReceiveChannel.cancel()
    }

    fun fetchAnime() {
        viewModelScope.launch {
            handleResult(
                animeReceiveChannel.receive(),
                _animeUiState
            ) {
                kitsuResponseUiMapper.toModel(it)
            }
        }
    }
}