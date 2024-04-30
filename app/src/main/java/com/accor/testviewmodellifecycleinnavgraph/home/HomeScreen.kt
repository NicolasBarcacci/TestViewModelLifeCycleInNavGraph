package com.accor.testviewmodellifecycleinnavgraph.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.accor.testviewmodellifecycleinnavgraph.navToSearchScreen

@Composable
fun HomeScreen(navController: NavController) {
    val homeViewModel: HomeViewModel = viewModel()
    HomeContent(
        navController = navController,
        homeViewModel = homeViewModel
    )
}

@Composable
fun HomeContent(
    navController: NavController,
    homeViewModel: HomeViewModel,
) {
    Column {
        Text("HomeScreen")
        Button(onClick = {
            navController.navToSearchScreen()
        }) {
            Text(text = "navToSearchScreen")
        }
    }
}
