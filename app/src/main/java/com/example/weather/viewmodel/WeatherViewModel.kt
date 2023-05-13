package com.example.weather.viewmodel

import android.location.Location
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.weather.WeatherApplication
import com.example.weather.repository.interfaces.WeatherRepository
import com.example.weather.viewmodel.interfaces.WeatherState
import kotlinx.coroutines.launch
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import retrofit2.HttpException
import java.io.IOException

class WeatherViewModel(private val weatherRepository:WeatherRepository):ViewModel() {

    var weatherUiState: WeatherState by mutableStateOf(WeatherState.Loading)
        private set

    init {
        getWeatherData()
    }
    fun getWeatherData(){
        viewModelScope.launch {
            weatherUiState = WeatherState.Loading
            weatherUiState = try{
                //var location: Location
                //val string = weatherRepository.getWeatherData()
                //val obj = Json.decodeFromString<Location>(string = string.location)
                //location = obj
                WeatherState.Success(
                    weatherRepository.getWeatherData().location
                )
            }catch (e:IOException) {
                WeatherState.Error
            }catch (e:HttpException){
                WeatherState.Error
            }
        }
    }

    companion object{
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as WeatherApplication)
                val weatherRepository = application.container.weatherRepository
                WeatherViewModel(weatherRepository = weatherRepository)
            }
        }
    }
}