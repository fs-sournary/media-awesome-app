package com.example.mediaawesomeapp.api

import com.example.mediaawesomeapp.model.response.Top1Response
import io.reactivex.Single
import retrofit2.http.GET

interface ChartApi {
    @GET("chart-realtime/get-top1")
    fun getTop1(): Single<Top1Response>
}