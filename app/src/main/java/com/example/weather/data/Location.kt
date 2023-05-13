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
    @SerialName("lat")
    val lat: Float,
    @SerialName("lon")
    val lon: Float,
    @SerialName("tz_id")
    val tzId: String,
    @SerialName("localtime_epoch")
    val localTimeEpoch: Int,
    @SerialName("localtime")
    val localTime: String
)
