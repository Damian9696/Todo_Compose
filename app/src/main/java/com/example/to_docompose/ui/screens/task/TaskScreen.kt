package com.example.to_docompose.ui.screens.task

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.to_docompose.data.models.Priority
import com.example.to_docompose.data.models.TodoTask
import com.example.to_docompose.util.Action

@Composable
fun TaskScreen(
    selectedTask: TodoTask?,
    navigateToListScreen: (Action) -> Unit
) {
    Scaffold(
        topBar = {
            TaskAppBar(
                selectedTask = selectedTask,
                navigateToListScreen = navigateToListScreen
            )
        },
        content = {
            TaskContent(
                title = "",
                onTitleChange = {},
                description = "",
                onDescriptionChange = {},
                priority = Priority.LOW,
                onPrioritySelected = {}
            )
        }
    )
}