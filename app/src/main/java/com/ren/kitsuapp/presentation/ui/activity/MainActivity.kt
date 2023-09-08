package com.ren.kitsuapp.presentation.ui.activity

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ren.kitsuapp.presentation.ui.screens.Routes.ANIME_SCREEN
import com.ren.kitsuapp.presentation.ui.screens.anime.AnimeScreen
import com.ren.kitsuapp.presentation.ui.theme.KitsuAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            KitsuAppTheme {
                NavHost(navController = navController, startDestination = ANIME_SCREEN.routeName) {
                    composable(ANIME_SCREEN.routeName) {
                        AnimeScreen(
                            navController = navController,
                        )
                    }
                }
            }
        }
    }
}