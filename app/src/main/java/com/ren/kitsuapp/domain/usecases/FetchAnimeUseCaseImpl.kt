package com.ren.kitsuapp.domain.usecases

import com.ren.kitsuapp.domain.base.None
import com.ren.kitsuapp.domain.base.UseCase
import com.ren.kitsuapp.domain.either.Either
import com.ren.kitsuapp.domain.models.KitsuResponse
import com.ren.kitsuapp.domain.repositories.AnimeRepository
import com.ren.kitsuapp.utils.dispatchers.AppDispatchers
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.withContext
import javax.inject.Inject

@ViewModelScoped
class FetchAnimeUseCaseImpl @Inject constructor(
    private val animeRepository: AnimeRepository,
    private val appDispatchers: AppDispatchers
) : UseCase<None, Either<String, KitsuResponse>>(appDispatchers) {

    override suspend fun execute(params: None) = withContext(appDispatchers.io) {
        animeRepository.fetchAnime().handleRequestState(
            error = {
                resultChannel.send(Either.Left(it))
            },
            success = {
                resultChannel.send(Either.Right(it))
            }
        )
    }
}