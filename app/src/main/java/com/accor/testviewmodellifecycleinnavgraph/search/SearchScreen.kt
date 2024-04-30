package com.accor.testviewmodellifecycleinnavgraph.search

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.accor.testviewmodellifecycleinnavgraph.navToHomeScreen
import com.accor.testviewmodellifecycleinnavgraph.navToSearchScreen

@Composable
fun SearchScreen(navController: NavController) {
    val searchViewModel: SearchViewModel = viewModel()
    SearchContent(
        navController = navController,
        searchViewModel = searchViewModel
    )
}

@Composable
fun SearchContent(
    navController: NavController,
    searchViewModel: SearchViewModel,
) {
    Column {
        Text("SearchScreen")
        Button(onClick = {
            navController.navToHomeScreen()
        }) {
            Text(text = "navToHomeScreen")
        }
    }
}
