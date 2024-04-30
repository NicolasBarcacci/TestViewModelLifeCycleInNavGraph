package com.accor.testviewmodellifecycleinnavgraph.home

import android.util.Log
import androidx.lifecycle.ViewModel

private var GlobalIndex = 0

class HomeViewModel : ViewModel() {

    private val index: Int

    init {
        GlobalIndex++
        index = GlobalIndex
        Log.d("MYTAG", "HomeViewModel - init ($index)")
    }

    override fun onCleared() {
        Log.d("MYTAG", "HomeViewModel - onCleared ($index)")
        super.onCleared()
    }
}
