package com.example.weather.network

import com.example.weather.data.WeatherModel
import retrofit2.http.GET

interface WeatherServiceApi {
    @GET()
    suspend fun getWeatherData(): WeatherModel
}