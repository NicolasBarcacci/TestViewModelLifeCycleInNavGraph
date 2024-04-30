package com.accor.testviewmodellifecycleinnavgraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.accor.testviewmodellifecycleinnavgraph.home.HomeScreen
import com.accor.testviewmodellifecycleinnavgraph.search.SearchScreen
import com.accor.testviewmodellifecycleinnavgraph.subgraph.hotel.HotelScreen
import com.accor.testviewmodellifecycleinnavgraph.subgraph.restaurant.RestaurantScreen
import com.accor.testviewmodellifecycleinnavgraph.subgraph.room.RoomScreen

private const val HomeScreen = "HomeScreen"
private const val SearchScreen = "SearchScreen"
private const val HotelScreen = "HotelScreen"
private const val RoomScreen = "RoomScreen"
private const val RestaurantScreen = "RestaurantScreen"
private const val BookingFlow = "BookingFlow"

@Composable
fun MainContent(
    activity: MainActivity,
) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = HomeScreen) {
        composable(HomeScreen) {
            HomeScreen(navController = navController)
        }
        composable(SearchScreen) {
            SearchScreen(viewModelStoreOwner = activity, navController = navController)
        }

        hotelNavGraph(navController)
    }
}

fun NavGraphBuilder.hotelNavGraph(navController: NavHostController) {
    navigation(startDestination = HotelScreen, route = BookingFlow) {
        composable(HotelScreen) {
            HotelScreen(navController)
        }
        composable(RoomScreen) {
            RoomScreen(navController)
        }
        composable(RestaurantScreen) {
            RestaurantScreen(
                navController.getViewModelStoreOwner(TODO()),
                navController
            )
        }
    }
}

fun NavController.navToHomeScreen() {
    this.navigate(HomeScreen)
}

fun NavController.navToSearchScreen() {
    this.navigate(SearchScreen)
}

fun NavController.navToBookingFlow() {
    this.navigate(BookingFlow)
}

fun NavController.navToHotelScreen() {
    this.navigate(HotelScreen)
}

fun NavController.navToRestaurantScreen() {
    this.navigate(RestaurantScreen)
}

fun NavController.navToRoomScreen() {
    this.navigate(RoomScreen)
}
