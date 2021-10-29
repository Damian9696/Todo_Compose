package com.example.to_docompose.navigation

import androidx.navigation.NavHostController
import com.example.to_docompose.util.Action
import com.example.to_docompose.util.Constants.LIST_SCREEN
import com.example.to_docompose.util.Constants.SPLASH_SCREEN

class Screens(navHostController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navHostController.navigate(route = "list/${action.name}") {
            popUpTo(LIST_SCREEN) {
                inclusive = true
            }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navHostController.navigate(route = "task/$taskId")
    }

    val splashScreen: () -> Unit = {
        navHostController.navigate(route = "list/${Action.NO_ACTION.name}") {
            popUpTo(SPLASH_SCREEN) {
                inclusive = true
            }
        }
    }
}