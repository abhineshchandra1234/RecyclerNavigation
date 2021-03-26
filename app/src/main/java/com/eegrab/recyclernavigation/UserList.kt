package com.eegrab.recyclernavigation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.eegrab.mqtttest.ViewModel.MainViewModel
import com.eegrab.mqtttest.ViewModel.MainViewModelFactory
import com.eegrab.post_project.repository.Repository
import com.google.gson.Gson
import org.json.JSONObject


class UserList : Fragment(R.layout.fragment_user_list) {

    val TAG = "Main"

    lateinit var viewModelFragment: FragmentsViewModel

    lateinit var viewModel: MainViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(TAG, "onViewCreated: is called")

        viewModelFragment = ViewModelProvider(this).get(FragmentsViewModel::class.java)

        viewModelFragment.printName()

        getUserDetails()
    }

    private fun getUserDetails() {
        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)

        try {
            //viewModel.pushUserDetails("SAP00992892","abc")
            viewModel.getUserDetails()
        }
        catch (e: Exception) {
//            Toast.makeText(this@MainActivity, e.message, Toast.LENGTH_LONG).show()
            Log.d("Main", e.message.toString())
        }

        viewModel.myResponse.observe(viewLifecycleOwner, Observer { response ->
            if (response.isSuccessful) {
                val jsonString = Gson().toJson(response.body())
                val obj = JSONObject(jsonString)
                
                Log.d(TAG, response.body().toString())
            }
        })
    }
}