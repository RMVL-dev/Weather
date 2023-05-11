package com.example.weather.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weather.repository.interfaces.WeatherRepository
import com.example.weather.viewmodel.interfaces.WeatherState
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException

class WeatherViewModel(private val weatherRepository:WeatherRepository):ViewModel() {

    var weatherUiState: WeatherState by mutableStateOf(WeatherState.Loading)
        private set

    fun getWeatherData(){
        viewModelScope.launch {
            weatherUiState = WeatherState.Loading
            weatherUiState = try{
                WeatherState.Success(
                    weatherRepository.getWeatherData()
                )
            }catch (e:IOException) {
                WeatherState.Error
            }catch (e:HttpException){
                WeatherState.Error
            }
        }
    }

    companion object
}