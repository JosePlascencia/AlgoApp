package com.example.algoapp.common

sealed class Screen(val route: String) {
    object MainScreen: Screen("main_screen")
    object AlgoListScreen: Screen("algo_list_screen")
    object AlgoDetailScreen: Screen("algo_detail_screen")
    object AlgoTypesScreen: Screen("algo_types_screen")
}
