package com.ren.kitsuapp.presentation.ui.screens.anime

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.ren.kitsuapp.R
import com.ren.kitsuapp.presentation.models.DataItemUi
import com.ren.kitsuapp.presentation.state.UIState
import com.ren.kitsuapp.presentation.ui.activity.MainViewModel

@Composable
fun AnimeScreen(
    modifier: Modifier = Modifier,
    mainViewModel: MainViewModel = hiltViewModel(),
    navController: NavController,
) {
    val animeUiState by mainViewModel.animeUiState.collectAsStateWithLifecycle()
    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        animeUiState.apply {
            when (this) {
                is UIState.Error -> {
                    Log.e("error", message)
                }

                is UIState.Loading -> {
                    CircularProgressBar()
                }

                is UIState.Success -> {
                    AnimeListLayout(data = data.data, navController = navController)
                }
            }
        }
    }
}

@Composable
fun AnimeListLayout(
    modifier: Modifier = Modifier,
    data: List<DataItemUi>,
    navController: NavController
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = modifier,
    ) {

        items(data) { item ->
            ItemAnime(
                item = item,
                onItemClick = {

                }
            )
        }
    }
}

@Composable
fun ItemAnime(item: DataItemUi, onItemClick: (id: String) -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clickable {
                onItemClick(item.id)
            },
        contentAlignment = Alignment.BottomCenter,
    ) {
        item.attributes.apply {
            AsyncImage(
                model = posterImage.original,
                contentDescription = stringResource(R.string.item_anime_image_content_description),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp),
                contentScale = ContentScale.FillBounds
            )
            Card(
                shape = RoundedCornerShape(corner = CornerSize(16.dp)),
                colors = CardDefaults.cardColors(containerColor = colorResource(id = R.color.red)),
                modifier = Modifier.padding(4.dp)
            ) {
                Text(
                    text = titles.enJp,
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(4.dp)
                )
            }
        }
    }
}

@Composable
fun CircularProgressBar() {
    CircularProgressIndicator(
        modifier = Modifier.wrapContentSize(),
        color = Color.Black,
        strokeWidth = 6.dp
    )
}
