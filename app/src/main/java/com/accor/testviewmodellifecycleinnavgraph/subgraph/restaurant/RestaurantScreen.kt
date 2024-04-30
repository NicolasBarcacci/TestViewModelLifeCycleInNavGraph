package com.accor.testviewmodellifecycleinnavgraph.subgraph.restaurant

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun RestaurantScreen() {
    val restaurantViewModel: RestaurantViewModel = viewModel()
    RestaurantContent(restaurantViewModel = restaurantViewModel)
}

@Composable
fun RestaurantContent(
    restaurantViewModel: RestaurantViewModel,
) {
    Text("RestaurantScreen")
}
