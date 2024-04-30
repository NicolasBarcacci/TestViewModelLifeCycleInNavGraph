package com.accor.testviewmodellifecycleinnavgraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.accor.testviewmodellifecycleinnavgraph.testview.TestScreen

private const val TestScreen = "TestScreen"

@Composable
fun MainContent() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = TestScreen) {
        composable(TestScreen) {
            TestScreen()
        }
    }
}

fun NavController.navToTestScreen() {
    this.navigate(TestScreen)
}
