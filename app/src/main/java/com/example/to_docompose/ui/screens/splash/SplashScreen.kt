package com.example.to_docompose.ui.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.to_docompose.R
import com.example.to_docompose.ui.theme.SPLASHSCREEN_LOGO_HEIGHT
import com.example.to_docompose.ui.theme.TodoComposeTheme
import com.example.to_docompose.ui.theme.splashScreenBackground

@Composable
fun SplashScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.splashScreenBackground),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier.size(SPLASHSCREEN_LOGO_HEIGHT),
            painter = painterResource(id = getLogo()),
            contentDescription = stringResource(R.string.splashscreen_logo)
        )
    }
}

@Composable
fun getLogo(): Int {
    return if (isSystemInDarkTheme()) {
        R.drawable.ic_dark_logo
    } else {
        R.drawable.ic_logo_light
    }
}

@Composable
@Preview
fun PreviewSplashScreen() {
    SplashScreen()
}

@Composable
@Preview
fun PreviewSplashScreenDark() {
    TodoComposeTheme(darkTheme = true) {
        SplashScreen()
    }
}
