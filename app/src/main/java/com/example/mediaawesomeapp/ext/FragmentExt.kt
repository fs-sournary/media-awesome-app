package com.example.mediaawesomeapp.ext

import androidx.fragment.app.Fragment
import com.example.mediaawesomeapp.util.AutoClearValue

/**
 * Created in 11/02/2020 by Sang
 */
fun <T : Any> Fragment.autoClear(): AutoClearValue<T> = AutoClearValue(this)
