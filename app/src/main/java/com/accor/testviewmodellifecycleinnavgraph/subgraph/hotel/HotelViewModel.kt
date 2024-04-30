package com.accor.testviewmodellifecycleinnavgraph.subgraph.hotel

import android.util.Log
import androidx.lifecycle.ViewModel

class HotelViewModel : ViewModel() {

    init {
        Log.d("MYTAG", "HotelViewModel - init")
    }

    override fun onCleared() {
        Log.d("MYTAG", "HotelViewModel - onCleared")
        super.onCleared()
    }
}
