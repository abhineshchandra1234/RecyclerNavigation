package com.eegrab.recyclernavigation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider


class UserList : Fragment(R.layout.fragment_user_list) {

    val TAG = "Main"

    lateinit var viewModel: FragmentsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(TAG, "onViewCreated: is called")

        viewModel = ViewModelProvider(this).get(FragmentsViewModel::class.java)
    }
}