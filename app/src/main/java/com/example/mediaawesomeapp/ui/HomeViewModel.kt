package com.example.mediaawesomeapp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map

/**
 * Created at 2020-01-02 by Sang
 */
class HomeViewModel : ViewModel(){

    private val data = MutableLiveData<Boolean>()
    val test = data.map {  }
}
