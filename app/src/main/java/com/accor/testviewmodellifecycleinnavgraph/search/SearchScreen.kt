package com.accor.testviewmodellifecycleinnavgraph.search

import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.accor.testviewmodellifecycleinnavgraph.navToBookingFlow
import com.accor.testviewmodellifecycleinnavgraph.navToHomeScreen
import com.accor.testviewmodellifecycleinnavgraph.ui.view.CommonView

@Composable
fun SearchScreen(
    activity: ComponentActivity,
    navController: NavController
) {
    val searchViewModel: SearchViewModel = viewModel(
        viewModelStoreOwner = activity,
    )
    SearchContent(
        navController = navController,
        searchViewModel = searchViewModel
    )
}

@Composable
fun SearchContent(
    navController: NavController,
    searchViewModel: SearchViewModel,
) {
    CommonView(
        screenName = "SearchScreen",
        navNext = "navToHomeScreen",
        navNextClick = { navController.navToHomeScreen() },
        navVertical = "navToSubgraph",
        navVerticalClick = { navController.navToBookingFlow() }
    )
}
