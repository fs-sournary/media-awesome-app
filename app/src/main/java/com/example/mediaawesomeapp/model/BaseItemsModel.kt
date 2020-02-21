package com.example.mediaawesomeapp.model

open class BaseItemsModel<T>(
    val total: Long? = null,
    val title: String? = null,
    val description: String? = null,
    val items: List<T>? = null)