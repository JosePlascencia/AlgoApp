package com.example.algoapp.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.algoapp.common.Screen
import com.example.algoapp.common.listOfAlgoTypes
import com.example.algoapp.presentation.algoDetailScreen.AlgoDetailScreen
import com.example.algoapp.presentation.algoListScreen.AlgoListScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.AlgoTypesScreen.route
    ) {
        composable(route = Screen.MainScreen.route) {

        }
        composable(route = Screen.AlgoTypesScreen.route) {
            AlgoListScreen(navController= navController, algoList = listOfAlgoTypes)
        }
        composable(route = Screen.AlgoListScreen.route) {
            AlgoListScreen(navController= navController, algoList = listOfAlgoTypes)
        }
        composable(route = Screen.AlgoDetailScreen.route) {
            AlgoDetailScreen(navController = navController)
        }
    }
}