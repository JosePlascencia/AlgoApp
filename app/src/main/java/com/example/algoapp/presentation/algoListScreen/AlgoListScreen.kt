package com.example.algoapp.presentation.algoListScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.algoapp.common.ListObject
import com.example.algoapp.common.Screen
import com.example.algoapp.presentation.algoListScreen.components.AlgoButton

@Composable
fun AlgoListScreen(navController: NavController, algoList: List<ListObject>) {
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        algoList.forEach(){
            AlgoButton(
                algoName = it.name,
                onClick = {
                    navController.navigate(it.route)
                }
            )
        }
    }
}