package com.accor.testviewmodellifecycleinnavgraph.subgraph.restaurant

import android.util.Log
import androidx.lifecycle.ViewModel

private var GlobalIndex = 0

class RestaurantViewModel : ViewModel() {

    private val index: Int

    init {
        GlobalIndex++
        index = GlobalIndex
        Log.d("MYTAG", "RestaurantViewModel - init ($index)")
    }

    override fun onCleared() {
        Log.d("MYTAG", "RestaurantViewModel - onCleared ($index)")
        super.onCleared()
    }
}
