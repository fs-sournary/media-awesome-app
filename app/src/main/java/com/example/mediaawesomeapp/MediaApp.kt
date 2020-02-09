package com.example.mediaawesomeapp

import android.app.Application
import com.example.mediaawesomeapp.di.appModule
import com.example.mediaawesomeapp.di.networkModule
import com.example.mediaawesomeapp.di.repositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

/**
 * Created at 2020-02-05 by Sang
 */
class MediaApp : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
        // Koin
        startKoin {
            androidContext(this@MediaApp)
            modules(listOf(appModule, networkModule, repositoryModule))
        }
    }
}
