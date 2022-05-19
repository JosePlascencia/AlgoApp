package com.example.algoapp.presentation.algo_list

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.algoapp.presentation.algo_list.components.AlgoButton

@Composable
fun AlgoListScreen(algoList: List<String>) {
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        algoList.forEach { AlgoButton(algoName = it, onClick = {}) }
    }
}