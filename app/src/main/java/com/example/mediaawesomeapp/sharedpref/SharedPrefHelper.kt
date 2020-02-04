package com.example.mediaawesomeapp.sharedpref

import android.content.Context
import androidx.core.content.edit

/**
 * Created at 2020-02-03 by Sang
 */
class SharedPrefHelper(context: Context) {

    private val sharedPreferences = context.applicationContext.getSharedPreferences(
        SHARED_PREF_NAME, Context.MODE_PRIVATE
    )

    fun setString(key: String, value: String) = sharedPreferences.edit { putString(key, value) }

    fun getString(key: String, defValue: String): String =
        sharedPreferences.getString(key, defValue) ?: defValue

    fun setInt(key: String, value: Int) = sharedPreferences.edit { putInt(key, value) }

    fun getInt(key: String, defValue: Int): Int = sharedPreferences.getInt(key, defValue)

    fun setBoolean(key: String, value: Boolean) = sharedPreferences.edit { putBoolean(key, value) }

    fun getBoolean(key: String, defValue: Boolean): Boolean =
        sharedPreferences.getBoolean(key, defValue)

    fun setLong(key: String, value: Long) = sharedPreferences.edit { putLong(key, value) }

    fun getLong(key: String, defValue: Long): Long = sharedPreferences.getLong(key, defValue)

    fun clear() = sharedPreferences.edit { clear() }

    fun remove(key: String) = sharedPreferences.edit { remove(key) }

    companion object {

        private const val SHARED_PREF_NAME = "com.example.architecture.android"
    }
}
