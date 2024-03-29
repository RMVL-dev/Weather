package com.example.weather.repository.classes

import com.example.weather.network.WeatherServiceApi
import com.example.weather.repository.interfaces.AppContainer
import com.example.weather.repository.interfaces.WeatherRepository
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit


class DefaultAppContainer: AppContainer {


    private val BASE_URL =
        "https://api.weatherapi.com/v1/"

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .build()

    private val retrofitService: WeatherServiceApi by lazy {
        retrofit.create(WeatherServiceApi::class.java)
    }


    override val weatherRepository: WeatherRepository by lazy {
        NetworkWeatherRepository(retrofit = retrofitService)
    }

}