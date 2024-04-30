package com.accor.testviewmodellifecycleinnavgraph.testview

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun TestScreen() {
    val testViewModel: TestViewModel = viewModel()
    TestContent(testViewModel = testViewModel)
}

@Composable
fun TestContent(
    testViewModel: TestViewModel,
) {
    Text("TestView")
}
