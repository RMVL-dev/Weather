package com.example.weather.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.weather.data.WeatherModel
import com.example.weather.viewmodel.WeatherViewModel
import com.example.weather.viewmodel.interfaces.WeatherState

@Composable
fun HomeScreen(){

    val weatherViewModel: WeatherViewModel = viewModel(
        factory = WeatherViewModel.Factory
    )

    Receipt(uiState = weatherViewModel.weatherUiState)
}


@Composable
fun Receipt(
    uiState: WeatherState
){
    when(uiState){
        is WeatherState.Success -> {
            TextForAllScreen(weather = uiState.weather)
        }
        is WeatherState.Error -> {

        }
        is WeatherState.Loading ->{

        }
    }
}

@Composable
fun TextForAllScreen(
    weather: WeatherModel
){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        Text(text = weather.location.townName)
        Text(text = weather.location.country.toString())
        Text(text = weather.location.localTime.toString())
        Text(text = weather.current.windDirection)
        Text(text = weather.current.feelsLikeC.toString())
        Text(text = weather.current.lastUpdated)
        Text(text = weather.current.isDay.toString())
        Text(text = weather.current.cloud.toString())
        Text(text = weather.current.gustKph.toString())
        Text(text = weather.current.precipIn.toString())
    }

}

@Composable
fun Error(){
    Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(text = "Error")
    }
}