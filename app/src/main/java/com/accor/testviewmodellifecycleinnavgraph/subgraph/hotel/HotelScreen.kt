package com.accor.testviewmodellifecycleinnavgraph.subgraph.hotel

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HotelScreen() {
    val hotelViewModel: HotelViewModel = viewModel()
    HotelContent(hotelViewModel = hotelViewModel)
}

@Composable
fun HotelContent(
    hotelViewModel: HotelViewModel,
) {
    Text("HotelScreen")
}
