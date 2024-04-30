package com.accor.testviewmodellifecycleinnavgraph.search

import android.util.Log
import androidx.lifecycle.ViewModel

class SearchViewModel : ViewModel() {

    init {
        Log.d("MYTAG", "SearchViewModel - init")
    }

    override fun onCleared() {
        Log.d("MYTAG", "SearchViewModel - onCleared")
        super.onCleared()
    }
}
