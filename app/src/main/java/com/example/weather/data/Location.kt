package com.example.weather.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Location(
    @SerialName("name")
    val townName: String,
    @SerialName("region")
    val townRegion: String,
    @SerialName("country")
    val country: String,
    @SerialName("localtime")
    val localTime: String
)
