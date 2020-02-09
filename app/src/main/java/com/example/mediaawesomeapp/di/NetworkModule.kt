package com.example.mediaawesomeapp.di

import com.example.mediaawesomeapp.util.NetworkManager
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

/**
 * Created at 2020-02-08 by Sang
 */
val networkModule = module {
    single { NetworkManager.createMusicApi(androidApplication()) }
    single { NetworkManager.createMovieApi(androidApplication()) }
}
