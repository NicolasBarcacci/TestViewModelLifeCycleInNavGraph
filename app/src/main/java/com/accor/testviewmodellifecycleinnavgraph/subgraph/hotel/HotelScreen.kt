package com.accor.testviewmodellifecycleinnavgraph.subgraph.hotel

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.accor.testviewmodellifecycleinnavgraph.navToBookingFlow
import com.accor.testviewmodellifecycleinnavgraph.navToHomeScreen
import com.accor.testviewmodellifecycleinnavgraph.navToRestaurantScreen
import com.accor.testviewmodellifecycleinnavgraph.navToRoomScreen
import com.accor.testviewmodellifecycleinnavgraph.navToSearchScreen
import com.accor.testviewmodellifecycleinnavgraph.ui.view.CommonView
import com.accor.testviewmodellifecycleinnavgraph.ui.view.CommonViewClickListener

@Composable
fun HotelScreen(navController: NavController) {
    val hotelViewModel: HotelViewModel = viewModel()
    HotelContent(
        navController = navController, hotelViewModel = hotelViewModel
    )
}

@Composable
private fun HotelContent(
    navController: NavController,
    hotelViewModel: HotelViewModel,
) {
    CommonView(
        screenName = "HotelScreen",
        navNext = "navToRestaurantScreen",
        navVertical = "navToHomeScreen",
        onClickListener = { clickListener -> onClickListener(navController, clickListener) }
    )
}

private fun onClickListener(
    navController: NavController,
    clickListener: CommonViewClickListener
): Unit = when (clickListener) {
    CommonViewClickListener.HorizontalNavigationClick -> navController.navToRestaurantScreen()
    CommonViewClickListener.VerticalNavigationClick -> navController.navToHomeScreen()
}
