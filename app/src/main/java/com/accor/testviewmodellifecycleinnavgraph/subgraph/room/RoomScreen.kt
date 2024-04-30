package com.accor.testviewmodellifecycleinnavgraph.subgraph.room

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.accor.testviewmodellifecycleinnavgraph.navToHomeScreen
import com.accor.testviewmodellifecycleinnavgraph.navToHotelScreen
import com.accor.testviewmodellifecycleinnavgraph.ui.view.CommonView
import com.accor.testviewmodellifecycleinnavgraph.ui.view.CommonViewClickListener

@Composable
fun RoomScreen(navController: NavController) {
    val roomViewModel: RoomViewModel = viewModel()
    RoomContent(
        navController = navController,
        roomViewModel = roomViewModel
    )
}

@Composable
fun RoomContent(
    navController: NavController,
    roomViewModel: RoomViewModel,
) {
    CommonView(
        screenName = "RoomScreen",
        navNext = "navToHotelScreen",
        navVertical = "navToHomeScreen",
        onClickListener = { clickListener -> onClickListener(navController, clickListener) }
    )
}

private fun onClickListener(
    navController: NavController,
    clickListener: CommonViewClickListener
): Unit = when (clickListener) {
    CommonViewClickListener.HorizontalNavigationClick -> navController.navToHotelScreen()
    CommonViewClickListener.VerticalNavigationClick -> navController.navToHomeScreen()
}
