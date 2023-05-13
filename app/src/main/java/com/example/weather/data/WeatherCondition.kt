package com.example.weather.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherCondition(
    @SerialName("text")
    val text: String,
    @SerialName("icon")
    val iconUrl:String,
    @SerialName ("code")
    val code: Int
)
