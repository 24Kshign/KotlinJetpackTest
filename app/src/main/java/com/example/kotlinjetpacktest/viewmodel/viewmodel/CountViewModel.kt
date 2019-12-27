package com.example.kotlinjetpacktest.viewmodel.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.cancel

class CountViewModel : ViewModel() {

    val count:MutableLiveData<Int> = MutableLiveData()

    override fun onCleared() {
        super.onCleared()
        viewModelScope.cancel()
    }
}
