package com.example.mediaawesomeapp.util

import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Created in 11/02/2020 by Sang
 *
 * Wrapper creates a lazy variable that is clean up when fragment is destroyed.
 * So that accessing this variable will throw NPE. Use case: Binding, ListAdapter...
 */
class AutoClearValue<T : Any>(fragment: Fragment) : ReadWriteProperty<Fragment, T> {

    private var _value: T? = null

    init {
        fragment.lifecycle.addObserver(object : LifecycleObserver {
            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            fun onDestroy() {
                _value = null
            }
        })
    }

    override fun getValue(thisRef: Fragment, property: KProperty<*>): T =
        _value ?: throw IllegalArgumentException("Auto-clear-view might not be available")

    override fun setValue(thisRef: Fragment, property: KProperty<*>, value: T) {
        _value = value
    }
}
