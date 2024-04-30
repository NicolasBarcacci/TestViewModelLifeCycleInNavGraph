package com.accor.testviewmodellifecycleinnavgraph.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen() {
    val homeViewModel: HomeViewModel = viewModel()
    HomeContent(homeViewModel = homeViewModel)
}

@Composable
fun HomeContent(
    homeViewModel: HomeViewModel,
) {
    Text("HomeScreen")
}
