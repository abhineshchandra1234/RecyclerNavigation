package com.eegrab.post_project.api

//import com.eegrab.wishkeyfinalui.model.BookingDetails.BookingDetails
import com.eegrab.recyclernavigation.api.UserDetails
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface SimpleApi {


    @GET("users?page=2")
    suspend fun getUserDetails(
    ): Response<UserDetails>


}

