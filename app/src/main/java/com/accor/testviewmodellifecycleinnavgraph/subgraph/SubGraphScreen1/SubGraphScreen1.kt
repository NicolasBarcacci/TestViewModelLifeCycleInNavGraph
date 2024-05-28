package com.accor.testviewmodellifecycleinnavgraph.subgraph.SubGraphScreen1

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.accor.testviewmodellifecycleinnavgraph.MainGraphScreen1
import com.accor.testviewmodellifecycleinnavgraph.SubGraphScreen1
import com.accor.testviewmodellifecycleinnavgraph.SubGraphScreen2
import com.accor.testviewmodellifecycleinnavgraph.navToMainGraphScreen1
import com.accor.testviewmodellifecycleinnavgraph.navToSubGraphScreen2
import com.accor.testviewmodellifecycleinnavgraph.ui.view.CommonView

@Composable
fun SubGraphScreen1(navController: NavController) {
    val subGraphScreen1ViewModel: SubGraphScreen1ViewModel = viewModel()
    HotelContent(
        navController = navController, subGraphScreen1ViewModel = subGraphScreen1ViewModel
    )
}

@Composable
fun HotelContent(
    navController: NavController,
    subGraphScreen1ViewModel: SubGraphScreen1ViewModel,
) {
    CommonView(
        screenName = SubGraphScreen1,
        navNext = "navTo$SubGraphScreen2",
        navNextClick = { navController.navToSubGraphScreen2() },
        navVertical = "navTo$MainGraphScreen1",
        navVerticalClick = { navController.navToMainGraphScreen1() }
    )
}
