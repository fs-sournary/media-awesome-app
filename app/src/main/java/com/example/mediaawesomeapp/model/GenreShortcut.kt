package com.example.mediaawesomeapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GenreShortcut(
    val id: Long,
    val type: Int? = null,
    val title: String? = null,
    val thumbnail: String? = null,
    val link: String? = null
) : Parcelable