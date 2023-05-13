package com.example.weather.viewmodel.interfaces

import com.example.weather.data.Location
import com.example.weather.data.WeatherModel

sealed interface WeatherState{
    data class Success(val weather: WeatherModel): WeatherState

    object Error: WeatherState

    object Loading: WeatherState
}