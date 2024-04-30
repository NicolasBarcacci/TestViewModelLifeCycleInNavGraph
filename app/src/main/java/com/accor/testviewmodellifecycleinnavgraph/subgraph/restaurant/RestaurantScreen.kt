package com.accor.testviewmodellifecycleinnavgraph.subgraph.restaurant

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.accor.testviewmodellifecycleinnavgraph.navToHomeScreen
import com.accor.testviewmodellifecycleinnavgraph.navToRoomScreen
import com.accor.testviewmodellifecycleinnavgraph.ui.view.CommonView

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
        navNextClick = { navController.navToRoomScreen() },
        navVertical = "navToHomeScreen",
        navVerticalClick = { navController.navToHomeScreen() }
    )
}
