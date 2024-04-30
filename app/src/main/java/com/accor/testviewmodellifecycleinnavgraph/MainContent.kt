package com.accor.testviewmodellifecycleinnavgraph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.accor.testviewmodellifecycleinnavgraph.testview.TestView

private const val TestView = "TestView"

@Composable
fun MainContent() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = TestView) {
        composable(TestView) {
            TestView()
        }
    }
}