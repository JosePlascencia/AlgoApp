package com.example.algoapp.presentation

sealed class Screen(val route: String) {
    object MainScreen: Screen("main_screen")
    object AlgoListScreen: Screen("algo_list_screen")
    object AlgoDetailsScreen: Screen("algo_details_screen")
}
