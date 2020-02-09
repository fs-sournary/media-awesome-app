package com.example.mediaawesomeapp.sharedpref

import java.util.*

/**
 * Created at 2020-02-03 by Sang
 */
class AppSharedPref(private val sharedPrefHelper: SharedPrefHelper) {

    fun setAccessToken(value: String) {
        sharedPrefHelper.setString(KEY_ACCESS_TOKEN, value)
    }

    fun getAccessToken(): String =
        sharedPrefHelper.getString(KEY_ACCESS_TOKEN, DEF_ACCESS_TOKEN)

    fun setLanguage(value: String) {
        sharedPrefHelper.setString(KEY_LANGUAGE, value)
    }

    fun getLanguage(): String =
        sharedPrefHelper.getString(KEY_LANGUAGE, Locale.getDefault().language)

    companion object {

        const val KEY_ACCESS_TOKEN = "KEY_ACCESS_TOKEN"
        const val DEF_ACCESS_TOKEN = ""
        const val KEY_LANGUAGE = "KEY_LANGUAGE"
    }
}