package com.accor.testviewmodellifecycleinnavgraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.accor.testviewmodellifecycleinnavgraph.home.HomeScreen
import com.accor.testviewmodellifecycleinnavgraph.search.SearchScreen

private const val HomeScreen = "HomeScreen"
private const val SearchScreen = "SearchScren"

@Composable
fun MainContent() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = HomeScreen) {
        composable(HomeScreen) {
            HomeScreen()
        }
        composable(SearchScreen) {
            SearchScreen()
        }
    }
}

fun NavController.navToTestScreen() {
    this.navigate(HomeScreen)
}

fun NavController.navToSearchScren() {
    this.navigate(SearchScreen)
}
