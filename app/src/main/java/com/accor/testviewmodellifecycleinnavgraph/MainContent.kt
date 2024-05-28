package com.accor.testviewmodellifecycleinnavgraph

import androidx.compose.runtime.Composable
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
import com.accor.testviewmodellifecycleinnavgraph.subgraph.SubGraphScreen3.SubGraphScreen3
import com.accor.testviewmodellifecycleinnavgraph.subgraph.SubGraphScreen2.SubGraphScreen2

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
    MainGraph(viewModelStoreOwner = activity)
}

@Composable
private fun MainGraph(
    viewModelStoreOwner: ViewModelStoreOwner,
) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = MainGraphScreen1) {
        composable(MainGraphScreen1) {
            MainGraphScreen1(navController = navController)
        }
        composable(MainGraphScreen2) {
            MainGraphScreen2(viewModelStoreOwner = viewModelStoreOwner, navController = navController)
        }

        subGraph(navController = navController, viewModelStoreOwner = viewModelStoreOwner)
    }
}

fun NavGraphBuilder.subGraph(
    navController: NavHostController,
    viewModelStoreOwner: ViewModelStoreOwner,
) {
    navigation(startDestination = SubGraphScreen1, route = SubGraph) {
        composable(SubGraphScreen1) {
            SubGraphScreen1(navController)
        }
        composable(SubGraphScreen2) {
            SubGraphScreen2(navController)
        }
        composable(SubGraphScreen3) {
            SubGraphScreen3(
                //                navController.getViewModelStoreOwner(TODO())
                viewModelStoreOwner = viewModelStoreOwner,
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
