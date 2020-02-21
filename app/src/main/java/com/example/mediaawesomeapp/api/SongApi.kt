package com.example.mediaawesomeapp.api

import com.example.mediaawesomeapp.model.response.RecommendSongResponse
import com.example.mediaawesomeapp.model.response.SongInfoResponse
import com.example.mediaawesomeapp.model.response.StreamingResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface SongApi {
    @GET("/song/get-song-info")
    fun getSongInfo(@Query("id") id: String): Single<SongInfoResponse>

    @GET("/song/get-streamings")
    fun getStreamings(@Query("id") id: String): Single<StreamingResponse>

    @GET("/recommend")
    fun getRecommendSong(@Query("id") id: String): Single<RecommendSongResponse>
}