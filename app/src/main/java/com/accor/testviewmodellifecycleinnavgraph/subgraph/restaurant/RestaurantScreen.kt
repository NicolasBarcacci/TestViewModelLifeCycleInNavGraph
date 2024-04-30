package com.accor.testviewmodellifecycleinnavgraph.subgraph.restaurant

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.accor.testviewmodellifecycleinnavgraph.navToHomeScreen
import com.accor.testviewmodellifecycleinnavgraph.navToRoomScreen
import com.accor.testviewmodellifecycleinnavgraph.ui.view.CommonView
import com.accor.testviewmodellifecycleinnavgraph.ui.view.CommonViewClickListener

@Composable
fun RestaurantScreen(
    viewModelStoreOwner: ViewModelStoreOwner,
    navController: NavController
) {
    val restaurantViewModel: RestaurantViewModel = viewModel(
        viewModelStoreOwner = viewModelStoreOwner,
    )
    RestaurantContent(
        navController = navController,
        restaurantViewModel = restaurantViewModel
    )
}

@Composable
fun RestaurantContent(
    navController: NavController,
    restaurantViewModel: RestaurantViewModel,
) {
    CommonView(
        screenName = "RestaurantScreen",
        navNext = "navToRoomScreen",
        navVertical = "navToHomeScreen",
        onClickListener = { clickListener -> onClickListener(navController, clickListener) }
    )
}

private fun onClickListener(
    navController: NavController,
    clickListener: CommonViewClickListener
): Unit = when (clickListener) {
    CommonViewClickListener.HorizontalNavigationClick -> navController.navToRoomScreen()
    CommonViewClickListener.VerticalNavigationClick -> navController.navToHomeScreen()
}
