package com.example.weather.ui.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.weather.viewmodel.WeatherViewModel

@Composable
fun HomeScreen(){

    val weatherViewModel: WeatherViewModel = viewModel(
        factory = WeatherViewModel.Factory
    )
    
    Text(text = weatherViewModel.weatherUiState.toString())

}