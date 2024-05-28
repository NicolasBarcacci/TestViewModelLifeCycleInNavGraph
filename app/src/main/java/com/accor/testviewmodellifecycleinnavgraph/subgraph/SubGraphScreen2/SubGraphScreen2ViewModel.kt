package com.accor.testviewmodellifecycleinnavgraph.subgraph.SubGraphScreen2

import android.util.Log
import androidx.lifecycle.ViewModel

private var GlobalIndex = 0

class SubGraphScreen2ViewModel : ViewModel() {

    private val index: Int

    init {
        GlobalIndex++
        index = GlobalIndex
        Log.d("MYTAG", "SubGraphScreen2ViewModel - init ($index)")
    }

    override fun onCleared() {
        Log.d("MYTAG", "SubGraphScreen2ViewModel - onCleared ($index)")
        super.onCleared()
    }
}
