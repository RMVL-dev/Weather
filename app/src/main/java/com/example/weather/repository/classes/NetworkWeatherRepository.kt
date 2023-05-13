package com.example.weather.repository.classes

import com.example.weather.data.WeatherModel
import com.example.weather.network.WeatherServiceApi
import com.example.weather.repository.interfaces.WeatherRepository

//todo: changing towns, maybe with database
class NetworkWeatherRepository(
    private val retrofit: WeatherServiceApi
): WeatherRepository {
    val town = "Berlin"
    private val url = "current.json?key=208b01204b0140c6bd595416231105&q=${town}&aqi=no"
    override suspend fun getWeatherData(): WeatherModel = retrofit.getWeatherData(url = url)

}