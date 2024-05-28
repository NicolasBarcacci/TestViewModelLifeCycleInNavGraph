package com.accor.testviewmodellifecycleinnavgraph.MainGraphScreen1

import android.util.Log
import androidx.lifecycle.ViewModel

private var GlobalIndex = 0

class MainGraphScreen1ViewModel : ViewModel() {

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
