package com.example.mediaawesomeapp.util

import android.content.Context
import com.example.mediaawesomeapp.BuildConfig
import com.example.mediaawesomeapp.api.ChartApi
import com.example.mediaawesomeapp.api.HomeApi
import com.example.mediaawesomeapp.api.SearchApi
import com.example.mediaawesomeapp.api.SongApi
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created at 2020-02-09 by Sang
 */
object NetworkManager {

    private const val CONNECT_TIMEOUT = 10L
    private const val WRITE_TIMEOUT = 10L
    private const val READ_TIMEOUT = 10L

    fun createSongApi(context: Context): SongApi =
        createRetrofit(BuildConfig.MUSIC_BASE_URL, context).create(SongApi::class.java)

    fun createChartApi(context: Context): ChartApi =
        createRetrofit(BuildConfig.MUSIC_BASE_URL, context).create(ChartApi::class.java)

    fun createHomeApi(context: Context): HomeApi =
        createRetrofit(BuildConfig.MUSIC_BASE_URL, context).create(HomeApi::class.java)

    fun createSearchApi(context: Context): SearchApi =
        createRetrofit(BuildConfig.MUSIC_BASE_URL, context).create(SearchApi::class.java)

    private fun createRetrofit(url: String, context: Context): Retrofit = Retrofit.Builder().apply {
        baseUrl(url)
        addConverterFactory(GsonConverterFactory.create())
        addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        client(createOkhttpClient(context))
    }.build()

    private fun createOkhttpClient(context: Context): OkHttpClient = OkHttpClient.Builder().apply {
        connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)
        readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
        writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)
        addInterceptor(createLoggingInterceptor())
        addInterceptor(createHeaderInterceptor())
        cache(createCache(context))
    }.build()

    private fun createHeaderInterceptor(): Interceptor = Interceptor.invoke { chain ->
        val currentRequest = chain.request()
        val newRequest = currentRequest.newBuilder().apply {
            url(currentRequest.url.newBuilder().build())
        }.build()
        chain.proceed(newRequest)
    }

    private fun createLoggingInterceptor(): Interceptor = HttpLoggingInterceptor().apply {
        level = when (BuildConfig.DEBUG) {
            true -> HttpLoggingInterceptor.Level.BODY
            else -> HttpLoggingInterceptor.Level.NONE
        }
    }

    private fun createCache(context: Context): Cache = Cache(context.cacheDir, 10 * 1024 * 2014)
}
