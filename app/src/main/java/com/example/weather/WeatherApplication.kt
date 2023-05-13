package com.example.weather

import android.app.Application
import com.example.weather.repository.classes.DefaultAppContainer
import com.example.weather.repository.interfaces.AppContainer

class WeatherApplication: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}