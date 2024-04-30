package com.accor.testviewmodellifecycleinnavgraph.subgraph.room

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.accor.testviewmodellifecycleinnavgraph.navToRoomScreen
import com.accor.testviewmodellifecycleinnavgraph.ui.view.CommonView

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
        textName = "navToRoomScreen"
    ) {
        navController.navToRoomScreen()
    }
}
