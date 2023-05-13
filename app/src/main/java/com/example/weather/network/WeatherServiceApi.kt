package com.example.weather.network

import com.example.weather.data.WeatherModel
import retrofit2.http.GET
import retrofit2.http.Url

interface WeatherServiceApi {

    //@GET("current.json?key=208b01204b0140c6bd595416231105")
    //suspend fun getWeatherData(@Query("q=") town: String): WeatherModel
    @GET
    suspend fun getWeatherData(@Url url: String): WeatherModel
}
