package com.accor.testviewmodellifecycleinnavgraph.testview

import android.util.Log
import androidx.lifecycle.ViewModel

class TestViewModel : ViewModel() {

    init {
        Log.d("MYTAG", "TestViewModel")
    }

    override fun onCleared() {
        Log.d("MYTAG", "onCleared")
        super.onCleared()
    }
}
