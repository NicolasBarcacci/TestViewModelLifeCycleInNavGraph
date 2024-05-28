package com.accor.testviewmodellifecycleinnavgraph

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModelStoreOwner
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.accor.testviewmodellifecycleinnavgraph.MainGraphScreen1.MainGraphScreen1
import com.accor.testviewmodellifecycleinnavgraph.MainGraphScreen2.MainGraphScreen2
import com.accor.testviewmodellifecycleinnavgraph.subgraph.SubGraphScreen1.SubGraphScreen1
import com.accor.testviewmodellifecycleinnavgraph.subgraph.SubGraphScreen2.SubGraphScreen2
import com.accor.testviewmodellifecycleinnavgraph.subgraph.SubGraphScreen3.SubGraphScreen3

const val MainGraphScreen1 = "MainGraphScreen1"
const val MainGraphScreen2 = "MainGraphScreen2"
const val SubGraph = "SubGraph"
const val SubGraphScreen1 = "SubGraphScreen1"
const val SubGraphScreen2 = "SubGraphScreen2"
const val SubGraphScreen3 = "SubGraphScreen3"

@Composable
fun MainContent(
    activity: MainActivity,
) {
    MainGraph(activityViewModelStoreOwner = activity)
}

@Composable
private fun MainGraph(
    activityViewModelStoreOwner: ViewModelStoreOwner,
) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = MainGraphScreen1) {
        composable(MainGraphScreen1) {
            MainGraphScreen1(navController = navController)
        }
        composable(MainGraphScreen2) {
            MainGraphScreen2(viewModelStoreOwner = activityViewModelStoreOwner, navController = navController)
        }

        subGraph(activityViewModelStoreOwner = activityViewModelStoreOwner, navController = navController)
    }
}

fun NavGraphBuilder.subGraph(
    activityViewModelStoreOwner: ViewModelStoreOwner,
    navController: NavHostController,
) {
    navigation(startDestination = SubGraphScreen1, route = SubGraph) {
        composable(SubGraphScreen1) {
            val parentEntry = remember(it) {
                navController.getBackStackEntry(SubGraph)
            }
            SubGraphScreen1(navController, hiltViewModel(parentEntry))
        }
        composable(SubGraphScreen2) {
            SubGraphScreen2(navController)
        }
        composable(SubGraphScreen3) {
            val parentEntry = remember(it) {
                navController.getBackStackEntry(SubGraph)
            }
            SubGraphScreen3(
                viewModelStoreOwner = parentEntry,
                navController = navController
            )
        }
    }
}

fun NavController.navToMainGraphScreen1() {
    this.navigate(MainGraphScreen1)
}

fun NavController.navToMainGraphScreen2() {
    this.navigate(MainGraphScreen2)
}

fun NavController.navToSubGraph() {
    this.navigate(SubGraph)
}

fun NavController.navToSubGraphScreen1() {
    this.navigate(SubGraphScreen1)
}

fun NavController.navToSubGraphScreen2() {
    this.navigate(SubGraphScreen2)
}

fun NavController.navToSubGraphScreen3() {
    this.navigate(SubGraphScreen3)
}
