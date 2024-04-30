package com.accor.testviewmodellifecycleinnavgraph.search

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun SearchScreen() {
    val searchViewModel: SearchViewModel = viewModel()
    SearchContent(searchViewModel = searchViewModel)
}

@Composable
fun SearchContent(
    searchViewModel: SearchViewModel,
) {
    Text("SearchScreen")
}
