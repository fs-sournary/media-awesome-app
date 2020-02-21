package com.example.mediaawesomeapp.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Spotlight(
    val id: String,
    val name: String? = null,
    val link: String? = null,
    val cover: String? = null,
    val thumbnail: String? = null,
    val spotlight: Boolean? = null,
    val follow: Long? = null,
    @SerializedName("oa_link")
    val oaLink: String? = null
) : Parcelable