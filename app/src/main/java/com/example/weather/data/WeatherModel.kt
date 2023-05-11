package com.example.weather.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

//todo: change lists for new data types
@Serializable
data class WeatherModel(
    @SerialName("location")
    val location: Location,
    @SerialName("current")
    val current: String
)
