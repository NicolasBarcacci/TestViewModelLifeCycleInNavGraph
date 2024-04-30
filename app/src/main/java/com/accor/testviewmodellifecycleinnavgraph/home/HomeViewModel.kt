package com.accor.testviewmodellifecycleinnavgraph.home

import android.util.Log
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    init {
        Log.d("MYTAG", "HomeViewModel - init")
    }

    override fun onCleared() {
        Log.d("MYTAG", "HomeViewModel - onCleared")
        super.onCleared()
    }
}
