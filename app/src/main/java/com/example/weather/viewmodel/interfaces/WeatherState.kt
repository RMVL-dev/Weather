package com.example.weather.viewmodel.interfaces

import com.example.weather.data.Location

sealed interface WeatherState{
    data class Success(val weather: Location): WeatherState

    object Error: WeatherState

    object Loading: WeatherState
}