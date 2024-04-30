package com.accor.testviewmodellifecycleinnavgraph.subgraph.room

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun RoomScreen() {
    val roomViewModel: RoomViewModel = viewModel()
    RoomContent(roomViewModel = roomViewModel)
}

@Composable
fun RoomContent(
    roomViewModel: RoomViewModel,
) {
    Text("RoomScreen")
}
