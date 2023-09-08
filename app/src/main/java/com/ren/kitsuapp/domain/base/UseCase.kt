package com.ren.kitsuapp.domain.base

import com.ren.kitsuapp.domain.either.Either
import com.ren.kitsuapp.utils.dispatchers.AppDispatchers
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.async
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

abstract class UseCase<in Params, Type : Any>(
    private val appDispatchers: AppDispatchers
) : CoroutineScope {

    private val parentJob = SupervisorJob()
    protected val resultChannel = Channel<Type>()

    val receiveChannel: ReceiveChannel<Type> = resultChannel

    override val coroutineContext: CoroutineContext
        get() = parentJob + appDispatchers.default

    protected abstract suspend fun execute(params: Params)

    protected suspend fun <L, R> Flow<Either<L, R>>.handleRequestState(
        error: suspend (message: L) -> Unit,
        success: suspend (data: R) -> Unit
    ) {
        this.collect {
            when (it) {
                is Either.Left -> it.message?.let { message ->
                    error(message)
                }

                is Either.Right -> it.data?.let { data ->
                    success(data)
                }
            }
        }
    }

    operator fun invoke(params: Params) {
        launch {
            execute(params)
        }
    }

    protected fun <T> doAsync(block: suspend () -> T): Deferred<T> = async {
        block()
    }

    fun clear() {
        resultChannel.close()
        parentJob.cancel()
    }
}

class None : Any()