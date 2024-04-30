package com.accor.testviewmodellifecycleinnavgraph.subgraph.hotel

import android.util.Log
import androidx.lifecycle.ViewModel

private var GlobalIndex = 0

class HotelViewModel : ViewModel() {

    private val index: Int

    init {
        GlobalIndex++
        index = GlobalIndex
        Log.d("MYTAG", "HotelViewModel - init ($index)")
    }

    override fun onCleared() {
        Log.d("MYTAG", "HotelViewModel - onCleared ($index)")
        super.onCleared()
    }
}
