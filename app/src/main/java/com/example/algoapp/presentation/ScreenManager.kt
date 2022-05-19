package com.example.algoapp.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.algoapp.presentation.algo_list.AlgoListScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.AlgoListScreen.route
    ) {
        composable(route = Screen.MainScreen.route) {

        }
        composable(route = Screen.AlgoListScreen.route) {
            val algoList: List<String> =
                listOf("Test Algo 1", "Test Algo 2" , "Test Algo 3", "Test Algo 4")
            AlgoListScreen(algoList = algoList)
        }
        composable(route = Screen.AlgoDetailsScreen.route) {

        }
    }
}