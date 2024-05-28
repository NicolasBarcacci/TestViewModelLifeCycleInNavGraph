package com.accor.testviewmodellifecycleinnavgraph.subgraph.SubGraphScreen3

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.accor.testviewmodellifecycleinnavgraph.MainGraphScreen1
import com.accor.testviewmodellifecycleinnavgraph.SubGraphScreen1
import com.accor.testviewmodellifecycleinnavgraph.SubGraphScreen3
import com.accor.testviewmodellifecycleinnavgraph.navToMainGraphScreen1
import com.accor.testviewmodellifecycleinnavgraph.navToSubGraphScreen1
import com.accor.testviewmodellifecycleinnavgraph.ui.view.CommonView

@Composable
fun SubGraphScreen3(
    viewModelStoreOwner: ViewModelStoreOwner,
    navController: NavController
) {
    val subGraphScreen3ViewModel: SubGraphScreen3ViewModel = viewModel(
        viewModelStoreOwner = viewModelStoreOwner,
    )
    RestaurantContent(
        navController = navController,
        subGraphScreen3ViewModel = subGraphScreen3ViewModel
    )
}

@Composable
fun RestaurantContent(
    navController: NavController,
    subGraphScreen3ViewModel: SubGraphScreen3ViewModel,
) {
    CommonView(
        screenName = "$SubGraphScreen3 (Linked to Activity LifeCycle)",
        navNext = "navTo$SubGraphScreen1",
        navNextClick = { navController.navToSubGraphScreen1() },
        navVertical = "navTo$MainGraphScreen1",
        navVerticalClick = { navController.navToMainGraphScreen1() }
    )
}
