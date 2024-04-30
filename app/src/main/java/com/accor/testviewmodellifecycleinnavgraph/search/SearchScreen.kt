package com.accor.testviewmodellifecycleinnavgraph.search

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.accor.testviewmodellifecycleinnavgraph.navToBookingFlow
import com.accor.testviewmodellifecycleinnavgraph.navToHomeScreen
import com.accor.testviewmodellifecycleinnavgraph.ui.view.CommonView
import com.accor.testviewmodellifecycleinnavgraph.ui.view.CommonViewClickListener

@Composable
fun SearchScreen(
    viewModelStoreOwner: ViewModelStoreOwner,
    navController: NavController
) {
    val searchViewModel: SearchViewModel = viewModel(
        viewModelStoreOwner = viewModelStoreOwner,
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
        screenName = "SearchScreen (Linked to Activity LifeCycle)",
        navNext = "navToHomeScreen",
        navVertical = "navToSubgraph",
        onClickListener = { clickListener -> onClickListener(navController, clickListener) }
    )
}

private fun onClickListener(
    navController: NavController,
    clickListener: CommonViewClickListener
): Unit = when (clickListener) {
    CommonViewClickListener.HorizontalNavigationClick -> navController.navToHomeScreen()
    CommonViewClickListener.VerticalNavigationClick -> navController.navToBookingFlow()
}
