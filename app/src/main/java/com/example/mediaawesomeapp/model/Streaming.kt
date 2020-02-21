package com.example.mediaawesomeapp.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
class Streaming(
    val default: StreamingDefault? = null
) : Parcelable

@Parcelize
class StreamingDefault(
    @SerializedName("128")
    val q128: String? = null,
    @SerializedName("320")
    val q320: String? = null
) : Parcelable