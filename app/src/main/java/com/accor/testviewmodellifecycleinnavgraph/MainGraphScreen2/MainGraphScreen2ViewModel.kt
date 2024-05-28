package com.accor.testviewmodellifecycleinnavgraph.MainGraphScreen2

import android.util.Log
import androidx.lifecycle.ViewModel

private var GlobalIndex = 0

class MainGraphScreen2ViewModel : ViewModel() {

    private val index: Int

    init {
        GlobalIndex++
        index = GlobalIndex
        Log.d("MYTAG", "MainGraphScreen2ViewModel - init ($index)")
    }

    override fun onCleared() {
        Log.d("MYTAG", "MainGraphScreen2ViewModel - onCleared ($index)")
        super.onCleared()
    }
}
