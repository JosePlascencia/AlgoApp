package com.example.algoapp.common

val listOfAlgoTypes =  listOf<ListObject>(
    AlgoTypes.SearchingAlgo,
    AlgoTypes.SortingAlgo
)

sealed class AlgoTypes (
    name: String
    ): ListObject(name, Screen.AlgoListScreen.route) {

    object SearchingAlgo: AlgoTypes("Searching Algorithms")
    object SortingAlgo: AlgoTypes("Sorting Algorithms")
}