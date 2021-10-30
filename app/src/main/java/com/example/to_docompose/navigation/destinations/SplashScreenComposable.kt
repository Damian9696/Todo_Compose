package com.example.to_docompose.navigation.destinations

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideOutVertically
import androidx.navigation.NavGraphBuilder
import com.example.to_docompose.ui.screens.splash.SplashScreen
import com.example.to_docompose.util.Constants.NAVIGATION_ANIMATION_DURATION
import com.example.to_docompose.util.Constants.SPLASH_SCREEN
import com.google.accompanist.navigation.animation.composable

@ExperimentalAnimationApi
fun NavGraphBuilder.splashscreenComposable(
    navigateToListScreen: () -> Unit
) {
    composable(
        route = SPLASH_SCREEN,
        exitTransition = { _, _ ->
            slideOutVertically(
                targetOffsetY = { fullHeight -> -fullHeight },
                animationSpec = tween(
                    durationMillis = NAVIGATION_ANIMATION_DURATION
                )
            )
        }
    ) {
        SplashScreen(navigateToListScreen = navigateToListScreen)
    }
}