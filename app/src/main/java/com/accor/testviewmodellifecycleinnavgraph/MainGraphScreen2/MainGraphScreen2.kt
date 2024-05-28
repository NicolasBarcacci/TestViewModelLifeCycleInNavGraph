package com.accor.testviewmodellifecycleinnavgraph.MainGraphScreen2

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.accor.testviewmodellifecycleinnavgraph.MainGraphScreen1
import com.accor.testviewmodellifecycleinnavgraph.MainGraphScreen2
import com.accor.testviewmodellifecycleinnavgraph.SubGraph
import com.accor.testviewmodellifecycleinnavgraph.navToMainGraphScreen1
import com.accor.testviewmodellifecycleinnavgraph.navToSubGraph
import com.accor.testviewmodellifecycleinnavgraph.ui.view.CommonView

@Composable
fun MainGraphScreen2(
    viewModelStoreOwner: ViewModelStoreOwner,
    navController: NavController,
) {
    val mainGraphScreen2ViewModel: MainGraphScreen2ViewModel = viewModel(
        viewModelStoreOwner = viewModelStoreOwner,
    )
    SearchContent(
        navController = navController,
        mainGraphScreen2ViewModel = mainGraphScreen2ViewModel
    )
}

@Composable
fun SearchContent(
    navController: NavController,
    mainGraphScreen2ViewModel: MainGraphScreen2ViewModel,
) {
    CommonView(
        screenName = "$MainGraphScreen2 (Linked to Activity LifeCycle)",
        navNext = "navTo$MainGraphScreen1",
        navNextClick = { navController.navToMainGraphScreen1() },
        navVertical = "navTo$SubGraph",
        navVerticalClick = { navController.navToSubGraph() }
    )
}
