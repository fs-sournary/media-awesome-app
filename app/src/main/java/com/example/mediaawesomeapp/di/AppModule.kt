package com.example.mediaawesomeapp.di

import com.example.mediaawesomeapp.db.AppDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

/**
 * Created at 2020-02-08 by Sang
 */
val appModule = module {
    single { AppDatabase.getDatabase(androidApplication()) }
}
