package com.ren.kitsuapp.presentation.base

import androidx.lifecycle.ViewModel
import com.ren.kitsuapp.domain.either.Either
import com.ren.kitsuapp.presentation.state.UIState
import kotlinx.coroutines.flow.MutableStateFlow

abstract class BaseViewModel : ViewModel() {

    protected fun <R, T> handleResult(
        result: Either<String, R>,
        state: MutableStateFlow<UIState<T>>,
        map: ((R) -> T)? = null
    ) {
        when (result) {
            is Either.Left -> result.message?.let { state.value = UIState.Error(it) }
            is Either.Right -> result.data?.let {
                if (map != null) {
                    state.value = UIState.Success(map.invoke(it))
                }
            }
        }
    }
}