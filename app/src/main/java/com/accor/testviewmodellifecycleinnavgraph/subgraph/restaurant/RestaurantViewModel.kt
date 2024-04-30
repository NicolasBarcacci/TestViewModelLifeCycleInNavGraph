package com.accor.testviewmodellifecycleinnavgraph.subgraph.restaurant

import android.util.Log
import androidx.lifecycle.ViewModel

class RestaurantViewModel : ViewModel() {

    init {
        Log.d("MYTAG", "RestaurantViewModel - init")
    }

    override fun onCleared() {
        Log.d("MYTAG", "RestaurantViewModel - onCleared")
        super.onCleared()
    }
}
