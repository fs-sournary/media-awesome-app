package com.example.mediaawesomeapp.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Chart(
    @SerializedName("song_vn")
    val songVN: List<Song>? = null,
    @SerializedName("song_us")
    val songUS: List<Song>? = null,
    @SerializedName("song_kpop")
    val songKPOP: List<Song>? = null
) : Parcelable