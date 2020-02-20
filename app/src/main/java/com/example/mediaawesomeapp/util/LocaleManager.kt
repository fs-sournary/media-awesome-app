package com.example.mediaawesomeapp.util

import android.content.Context
import android.content.res.Configuration
import com.example.mediaawesomeapp.sharedpref.AppSharedPref
import java.util.*

/**
 * Created at 2020-02-03 by Sang
 */
class LocaleManager(private val appSharedPref: AppSharedPref) {

    fun onAttach(context: Context): Context = getNewContext(context, appSharedPref.getLanguage())

    fun setLocale(context: Context, language: String) {
        appSharedPref.setLanguage(language)
        updateResource(context, language)
    }

    private fun updateResource(context: Context, language: String) {
        val locale = Locale(language)
        Locale.setDefault(locale)
        val resource = context.resources
        val newConfiguration = Configuration(resource.configuration).apply {
            setLocale(locale)
            setLayoutDirection(locale)
        }
        resource.updateConfiguration(newConfiguration, resource.displayMetrics)
    }

    private fun getNewContext(context: Context, language: String): Context {
        val locale = Locale(language)
        Locale.setDefault(locale)
        val resource = context.resources
        val newConfiguration = Configuration(resource.configuration).apply {
            setLocale(locale)
            setLayoutDirection(locale)
        }
        return context.createConfigurationContext(newConfiguration)
    }
}
