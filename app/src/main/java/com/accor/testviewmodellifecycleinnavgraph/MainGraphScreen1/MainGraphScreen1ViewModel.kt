package com.accor.testviewmodellifecycleinnavgraph.MainGraphScreen1

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

private var GlobalIndex = 0

@HiltViewModel
class MainGraphScreen1ViewModel @Inject constructor() : ViewModel() {

    private val index: Int

    init {
        GlobalIndex++
        index = GlobalIndex
        Log.d("MYTAG", "MainGraphScreen1ViewModel - init ($index)")
    }

    override fun onCleared() {
        Log.d("MYTAG", "MainGraphScreen1ViewModel - onCleared ($index)")
        super.onCleared()
    }
}
