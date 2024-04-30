package com.accor.testviewmodellifecycleinnavgraph.subgraph.hotel

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.accor.testviewmodellifecycleinnavgraph.navToHomeScreen
import com.accor.testviewmodellifecycleinnavgraph.navToRestaurantScreen
import com.accor.testviewmodellifecycleinnavgraph.ui.view.CommonView

@Composable
fun HotelScreen(navController: NavController) {
    val hotelViewModel: HotelViewModel = viewModel()
    HotelContent(
        navController = navController, hotelViewModel = hotelViewModel
    )
}

@Composable
fun HotelContent(
    navController: NavController,
    hotelViewModel: HotelViewModel,
) {
    CommonView(
        screenName = "HotelScreen",
        navNext = "navToRestaurantScreen",
        navNextClick = { navController.navToRestaurantScreen() },
        navVertical = "navToHomeScreen",
        navVerticalClick = { navController.navToHomeScreen() }
    )
}
