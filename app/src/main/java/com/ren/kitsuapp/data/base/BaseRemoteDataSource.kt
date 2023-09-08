package com.ren.kitsuapp.data.base

import com.ren.kitsuapp.domain.either.Either
import com.ren.kitsuapp.utils.dispatchers.AppDispatchers
import com.ren.kitsuapp.utils.mappers.Mapper
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.Response

abstract class BaseRemoteDataSource(private val appDispatchers: AppDispatchers) {

    fun <F, T> doNetworkRequest(
        map: ((it: F) -> T)? = null,
        request: suspend () -> Response<F>
    ) = flow<Either<String, T>> {
        request().apply {
            takeIf { it.isSuccessful }?.body()?.let {
                emit(Either.Right(map?.let { invoke ->
                    invoke(it)
                }))
            }
            takeUnless { it.isSuccessful }?.message()?.let {
                emit(Either.Left(it))
            }
        }
    }.flowOn(appDispatchers.io)
}