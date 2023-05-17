package com.example.weather.repository.interfaces

import com.example.weather.data.WeatherModel

interface WeatherRepository {
    suspend fun getWeatherData(town:String):WeatherModel
}