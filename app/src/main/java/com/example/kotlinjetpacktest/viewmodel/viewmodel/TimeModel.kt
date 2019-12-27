package com.example.kotlinjetpacktest.viewmodel.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.cancel

class TimeModel : ViewModel() {

    var time: Long = 0

    override fun onCleared() {
        super.onCleared()
        viewModelScope.cancel()
    }

}
