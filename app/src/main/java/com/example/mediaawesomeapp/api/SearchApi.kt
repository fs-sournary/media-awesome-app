package com.example.mediaawesomeapp.api

import com.example.mediaawesomeapp.model.response.HotKeyResponse
import com.example.mediaawesomeapp.model.response.MultipleSearchResponse
import com.example.mediaawesomeapp.model.response.SearchSongResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface SearchApi {
    @GET("/search/multi")
    fun searchMultiple(@Query("q") q: String): Single<MultipleSearchResponse>

    @GET("/search")
    fun searchByType(
        @Query("type") type: String,
        @Query("q") q: String
    ): Single<SearchSongResponse>

    @GET("/search/get-hot-key")
    fun getHotKey(): Single<HotKeyResponse>
}