package com.accor.testviewmodellifecycleinnavgraph.subgraph.room

import android.util.Log
import androidx.lifecycle.ViewModel

class RoomViewModel : ViewModel() {

    init {
        Log.d("MYTAG", "RoomViewModel - init")
    }

    override fun onCleared() {
        Log.d("MYTAG", "RoomViewModel - onCleared")
        super.onCleared()
    }
}
