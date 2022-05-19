package com.example.algoapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.algoapp.presentation.algo_list.AlgoListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlgoAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainMenu()
                }
            }
        }
    }

    @Preview
    @Composable
    fun MainMenu() {
        val algoList: List<String> =
            listOf("Test Algo 1", "Test Algo 2" , "Test Algo 3", "Test Algo 4")
        AlgoListScreen(algoList = algoList)
    }
}