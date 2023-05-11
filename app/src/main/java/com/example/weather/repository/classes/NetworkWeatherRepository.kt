package com.example.weather.repository.classes

import com.example.weather.data.WeatherModel
import com.example.weather.network.WeatherServiceApi
import com.example.weather.repository.interfaces.WeatherRepository
import retrofit2.Retrofit

class NetworkWeatherRepository(
    private val retrofit: WeatherServiceApi
): WeatherRepository {

    override suspend fun getWeatherData(): WeatherModel = retrofit.getWeatherData()

}