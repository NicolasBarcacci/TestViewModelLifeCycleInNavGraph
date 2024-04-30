package com.accor.testviewmodellifecycleinnavgraph.home

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.accor.testviewmodellifecycleinnavgraph.navToBookingFlow
import com.accor.testviewmodellifecycleinnavgraph.navToSearchScreen
import com.accor.testviewmodellifecycleinnavgraph.ui.view.CommonView

@Composable
fun HomeScreen(navController: NavController) {
    val homeViewModel: HomeViewModel = viewModel()
    HomeContent(
        navController = navController,
        homeViewModel = homeViewModel
    )
}

@Composable
fun HomeContent(
    navController: NavController,
    homeViewModel: HomeViewModel,
) {
    CommonView(
        screenName = "HomeScreen",
        navNext = "navToSearchScreen",
        navNextClick = { navController.navToSearchScreen() },
        navVertical = "navToSubgraph",
        navVerticalClick = { navController.navToBookingFlow() }
    )
}
