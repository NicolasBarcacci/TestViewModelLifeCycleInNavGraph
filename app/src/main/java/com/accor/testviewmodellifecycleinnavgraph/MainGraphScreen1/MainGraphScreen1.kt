package com.accor.testviewmodellifecycleinnavgraph.MainGraphScreen1

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.accor.testviewmodellifecycleinnavgraph.MainGraphScreen1
import com.accor.testviewmodellifecycleinnavgraph.MainGraphScreen2
import com.accor.testviewmodellifecycleinnavgraph.SubGraph
import com.accor.testviewmodellifecycleinnavgraph.navToMainGraphScreen2
import com.accor.testviewmodellifecycleinnavgraph.navToSubGraph
import com.accor.testviewmodellifecycleinnavgraph.ui.view.CommonView

@Composable
fun MainGraphScreen1(
    navController: NavController,
) {
    val mainGraphScreen1ViewModel: MainGraphScreen1ViewModel = hiltViewModel()
    HomeContent(
        navController = navController,
        mainGraphScreen1ViewModel = mainGraphScreen1ViewModel
    )
}

@Composable
fun HomeContent(
    navController: NavController,
    mainGraphScreen1ViewModel: MainGraphScreen1ViewModel,
) {
    CommonView(
        screenName = MainGraphScreen1,
        navNext = "navTo$MainGraphScreen2",
        navNextClick = { navController.navToMainGraphScreen2() },
        navVertical = "navTo$SubGraph",
        navVerticalClick = { navController.navToSubGraph() }
    )
}
