package com.example.mediaawesomeapp.api

import com.example.mediaawesomeapp.model.response.HomeResponse
import io.reactivex.Single
import retrofit2.http.GET

interface HomeApi {
    @GET("/home")
    fun getHome(): Single<HomeResponse>
}