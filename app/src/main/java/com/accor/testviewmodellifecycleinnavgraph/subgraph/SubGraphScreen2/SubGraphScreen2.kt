package com.accor.testviewmodellifecycleinnavgraph.subgraph.SubGraphScreen2

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.accor.testviewmodellifecycleinnavgraph.MainGraphScreen1
import com.accor.testviewmodellifecycleinnavgraph.SubGraphScreen1
import com.accor.testviewmodellifecycleinnavgraph.SubGraphScreen2
import com.accor.testviewmodellifecycleinnavgraph.SubGraphScreen3
import com.accor.testviewmodellifecycleinnavgraph.navToMainGraphScreen1
import com.accor.testviewmodellifecycleinnavgraph.navToSubGraphScreen1
import com.accor.testviewmodellifecycleinnavgraph.navToSubGraphScreen3
import com.accor.testviewmodellifecycleinnavgraph.ui.view.CommonView

@Composable
fun SubGraphScreen2(navController: NavController) {
    val subGraphScreen2ViewModel: SubGraphScreen2ViewModel = viewModel()
    RoomContent(
        navController = navController,
        subGraphScreen2ViewModel = subGraphScreen2ViewModel
    )
}

@Composable
fun RoomContent(
    navController: NavController,
    subGraphScreen2ViewModel: SubGraphScreen2ViewModel,
) {
    CommonView(
        screenName = SubGraphScreen2,
        navNext = "navTo$SubGraphScreen3",
        navNextClick = { navController.navToSubGraphScreen3() },
        navVertical = "navTo$MainGraphScreen1",
        navVerticalClick = { navController.navToMainGraphScreen1() }
    )
}
