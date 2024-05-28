package com.accor.testviewmodellifecycleinnavgraph.subgraph.SubGraphScreen3

import android.util.Log
import androidx.lifecycle.ViewModel

private var GlobalIndex = 0

class SubGraphScreen3ViewModel : ViewModel() {

    private val index: Int

    init {
        GlobalIndex++
        index = GlobalIndex
        Log.d("MYTAG", "SubGraphScreen3ViewModel - init ($index)")
    }

    override fun onCleared() {
        Log.d("MYTAG", "SubGraphScreen3ViewModel - onCleared ($index)")
        super.onCleared()
    }
}
