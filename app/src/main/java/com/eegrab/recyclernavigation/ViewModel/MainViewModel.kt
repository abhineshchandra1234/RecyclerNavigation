package com.eegrab.mqtttest.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eegrab.post_project.repository.Repository
import com.eegrab.recyclernavigation.api.UserDetails


//import com.eegrab.wishkeyfinalui.model.BookingDetails.BookingDetails
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository): ViewModel() {

    val myResponse: MutableLiveData<Response<UserDetails>> = MutableLiveData()


    fun getUserDetails() {
        viewModelScope.launch {
            val response = repository.getUserDetails()
            myResponse.value = response
        }
    }

}