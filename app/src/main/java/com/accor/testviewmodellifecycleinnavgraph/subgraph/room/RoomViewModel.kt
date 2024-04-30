package com.accor.testviewmodellifecycleinnavgraph.subgraph.room

import android.util.Log
import androidx.lifecycle.ViewModel

private var GlobalIndex = 0

class RoomViewModel : ViewModel() {

    private val index: Int

    init {
        GlobalIndex++
        index = GlobalIndex
        Log.d("MYTAG", "RoomViewModel - init ($index)")
    }

    override fun onCleared() {
        Log.d("MYTAG", "RoomViewModel - onCleared ($index)")
        super.onCleared()
    }
}
