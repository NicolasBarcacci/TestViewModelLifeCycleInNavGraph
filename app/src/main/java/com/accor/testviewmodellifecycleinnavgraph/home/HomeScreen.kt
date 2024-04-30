package com.accor.testviewmodellifecycleinnavgraph.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun TestScreen() {
    val homeViewModel: HomeViewModel = viewModel()
    TestContent(homeViewModel = homeViewModel)
}

@Composable
fun TestContent(
    homeViewModel: HomeViewModel,
) {
    Text("TestView")
}
