package com.eegrab.post_project.repository


import com.eegrab.post_project.api.RetrofitInstance
import com.eegrab.recyclernavigation.api.UserDetails



import retrofit2.Response

class Repository {

    suspend fun getUserDetails(): Response<UserDetails> {
        return RetrofitInstance.api.getUserDetails()
    }

}