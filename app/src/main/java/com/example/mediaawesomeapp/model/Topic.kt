package com.example.mediaawesomeapp.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Topic(
    val title: String? = null,
    @SerializedName("items")
    val albums: List<Album>? = null
) : Parcelable