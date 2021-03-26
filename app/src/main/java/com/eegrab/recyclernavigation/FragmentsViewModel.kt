package com.eegrab.recyclernavigation

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.eegrab.mqtttest.ViewModel.MainViewModel
import com.eegrab.mqtttest.ViewModel.MainViewModelFactory
import com.eegrab.post_project.repository.Repository

class FragmentsViewModel: ViewModel() {

    lateinit var viewModel: MainViewModel


    fun printName() {
        //print("My name is abhinesh")
        Log.d("Main", "My name is abhinesh: ")


    }

}