package com.accor.testviewmodellifecycleinnavgraph.home

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.accor.testviewmodellifecycleinnavgraph.navToBookingFlow
import com.accor.testviewmodellifecycleinnavgraph.navToSearchScreen
import com.accor.testviewmodellifecycleinnavgraph.ui.view.CommonView
import com.accor.testviewmodellifecycleinnavgraph.ui.view.CommonViewClickListener

@Composable
fun HomeScreen(navController: NavController) {
    val homeViewModel: HomeViewModel = viewModel()
    HomeContent(
        navController = navController,
        homeViewModel = homeViewModel
    )
}

@Composable
private fun HomeContent(
    navController: NavController,
    homeViewModel: HomeViewModel,
) {
    CommonView(
        screenName = "HomeScreen",
        navNext = "navToSearchScreen",
        navVertical = "navToSubgraph",
        onClickListener = { clickListener -> onClickListener(navController, clickListener) }
    )
}

private fun onClickListener(
    navController: NavController,
    clickListener: CommonViewClickListener
): Unit = when (clickListener) {
    CommonViewClickListener.HorizontalNavigationClick -> navController.navToSearchScreen()
    CommonViewClickListener.VerticalNavigationClick -> navController.navToBookingFlow()
}
