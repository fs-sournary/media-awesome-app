/**
 * gkc_hash_code : 01DTTE3W3Z4Y56WHYW8SYCTXMK
 */

package com.example.mediaawesomeapp.di

import com.example.mediaawesomeapp.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel() }
}