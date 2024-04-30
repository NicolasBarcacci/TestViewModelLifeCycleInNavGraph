package com.accor.testviewmodellifecycleinnavgraph.home

import android.util.Log
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    init {
        Log.d("MYTAG", "TestViewModel")
    }

    override fun onCleared() {
        Log.d("MYTAG", "onCleared")
        super.onCleared()
    }
}
