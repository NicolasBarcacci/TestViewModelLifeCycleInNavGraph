package com.accor.testviewmodellifecycleinnavgraph.search

import android.util.Log
import androidx.lifecycle.ViewModel

private var GlobalIndex = 0

class SearchViewModel : ViewModel() {

    private val index: Int

    init {
        GlobalIndex++
        index = GlobalIndex
        Log.d("MYTAG", "SearchViewModel - init ($index)")
    }

    override fun onCleared() {
        Log.d("MYTAG", "SearchViewModel - onCleared ($index)")
        super.onCleared()
    }
}
