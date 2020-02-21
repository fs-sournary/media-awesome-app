package com.example.mediaawesomeapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Genre(
    val id: String,
    val name: String? = null,
    val alias: String? = null,
    val link: String? = null
) : Parcelable