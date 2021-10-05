package com.example.to_docompose.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.to_docompose.data.models.TodoTask
import com.example.to_docompose.data.repositories.TodoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(private val todoRepository: TodoRepository) :
    ViewModel() {

    private val _allTasks = MutableStateFlow<List<TodoTask>>(emptyList())
    val allTasks: StateFlow<List<TodoTask>> get() = _allTasks

    fun getAllTasks() {
        viewModelScope.launch {
            todoRepository.getAllTasks.collect {
                _allTasks.value = it
            }
        }
    }
}