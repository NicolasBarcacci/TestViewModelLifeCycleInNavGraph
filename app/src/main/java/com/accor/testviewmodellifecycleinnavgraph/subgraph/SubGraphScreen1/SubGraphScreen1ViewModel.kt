package com.accor.testviewmodellifecycleinnavgraph.subgraph.SubGraphScreen1

import android.util.Log
import androidx.lifecycle.ViewModel

private var GlobalIndex = 0

class SubGraphScreen1ViewModel : ViewModel() {

    private val index: Int

    init {
        GlobalIndex++
        index = GlobalIndex
        Log.d("MYTAG", "SubGraphScreen1ViewModel - init ($index)")
    }

    override fun onCleared() {
        Log.d("MYTAG", "SubGraphScreen1ViewModel - onCleared ($index)")
        super.onCleared()
    }
}
