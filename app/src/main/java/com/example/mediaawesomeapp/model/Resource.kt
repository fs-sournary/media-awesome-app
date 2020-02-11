package com.example.mediaawesomeapp.model

/**
 * Created in 11/02/2020 by Sang
 */
data class Resource<out T>(val status: Status, val data: T?, val msg: String?) {

    companion object {

        fun <T> loading(data: T?) = Resource(Status.LOADING, data, null)

        fun <T> success(data: T?) = Resource(Status.SUCCESS, data, null)

        fun <T> error(data: T?, msg: String?) = Resource(Status.ERROR, data, msg)
    }
}
