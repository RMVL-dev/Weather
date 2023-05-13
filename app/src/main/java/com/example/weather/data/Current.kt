package com.example.weather.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.util.concurrent.locks.Condition

@Serializable
data class Current(
    @SerialName("last_updated_epoch")
    val lastUpdatedEpoch: Int,
    @SerialName("last_updated")
    val lastUpdated: String,
    @SerialName("temp_c")
    val tempC: Float,
    @SerialName("temp_f")
    val tempF: Float,
    @SerialName("is_day")
    val isDay: Int,
    @SerialName("condition")
    val condition: WeatherCondition,
    @SerialName("wind_mph")
    val windMph: Float,
    @SerialName("wind_kph")
    val windKph: Float,
    @SerialName("wind_degree")
    val windDegree: Float,
    @SerialName("wind_dir")
    val windDirection: String,
    @SerialName("pressure_mb")
    val pressureMb: Float,
    @SerialName("pressure_in")
    val pressureIn: Float,
    @SerialName("precip_mm")
    val precipMm: Float,
    @SerialName("precip_in")
    val precipIn: Float,
    @SerialName("humidity")
    val humidity: Float,
    @SerialName("cloud")
    val cloud: Float,
    @SerialName("feelslike_c")
    val feelsLikeC: Float,
    @SerialName("feelslike_f")
    val feelsLikeF: Float,
    @SerialName("vis_km")
    val visKm: Float,
    @SerialName("vis_miles")
    val visMiles: Float,
    @SerialName("uv")
    val indexUV: Float,
    @SerialName("gust_mph")
    val gustMph: Float,
    @SerialName("gust_kph")
    val gustKph: Float,
    )
