package com.example.mediaawesomeapp.di

import com.example.mediaawesomeapp.repository.MusicRepository
import org.koin.dsl.module

/**
 * Created at 2020-02-04 by Sang
 */
val repositoryModule = module {
    single { MusicRepository() }
}
