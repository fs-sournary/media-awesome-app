package com.example.mediaawesomeapp.ui.home

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.map

/**
 * Created at 2020-01-02 by Sang
 */
class HomeViewModel(application: Application) : AndroidViewModel(application) {

    private val data = MutableLiveData<Boolean>()
    val test = data.map { }
}
