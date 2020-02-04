package com.example.mediaawesomeapp.sharedpref

import com.example.mediaawesomeapp.util.Constants
import java.util.*

/**
 * Created at 2020-02-03 by Sang
 */
class AppSharedPref(private val sharedPrefHelper: SharedPrefHelper) {

    fun setAccessToken(value: String) {
        sharedPrefHelper.setString(Constants.KEY_ACCESS_TOKEN, value)
    }

    fun getAccessToken(): String =
        sharedPrefHelper.getString(Constants.KEY_ACCESS_TOKEN, Constants.DEF_ACCESS_TOKEN)

    fun setLanguage(value: String) {
        sharedPrefHelper.setString(Constants.KEY_LANGUAGE, value)
    }

    fun getLanguage(): String =
        sharedPrefHelper.getString(Constants.KEY_LANGUAGE, Locale.getDefault().language)
}