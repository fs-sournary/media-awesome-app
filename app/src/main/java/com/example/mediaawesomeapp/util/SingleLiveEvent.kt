package com.example.mediaawesomeapp.util

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import java.util.concurrent.atomic.AtomicBoolean

/**
 * Created at 2020-02-03 by Sang
 *
 * A custom MutableLiveData that only uses for single events such as navigation, show toast...
 */
class SingleLiveEvent<T> : MutableLiveData<T>() {

    private val pending = AtomicBoolean(false)

    override fun setValue(value: T?) {
        pending.set(true)
        super.setValue(value)
    }

    override fun observe(owner: LifecycleOwner, observer: Observer<in T>) {
        super.observe(owner, Observer {
            if (pending.compareAndSet(true, false)) observer.onChanged(it)
        })
    }

    /**
     * Single event for no data. Make this class easy to use with no data.
     * Ex: val t = SingleLiveEvent<Any>()
     */
    fun call() {
        value = null
    }
}
