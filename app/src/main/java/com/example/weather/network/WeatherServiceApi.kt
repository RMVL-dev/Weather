package com.example.weather.network

import com.example.weather.data.WeatherModel
import retrofit2.http.GET

interface WeatherServiceApi {
    @GET("current.json?key=208b01204b0140c6bd595416231105&q=London&aqi=no")
    suspend fun getWeatherData(): WeatherModel
}