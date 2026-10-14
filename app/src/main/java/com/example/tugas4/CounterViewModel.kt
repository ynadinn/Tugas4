package com.example.tugas4

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CounterViewModel : ViewModel() {

    private val _count = MutableStateFlow(0)
    val count: StateFlow<Int> = _count

    fun up() {
        _count.value++
    }

    fun down() {
        _count.value--
    }

    fun reset() {
        _count.value = 0
    }
}
