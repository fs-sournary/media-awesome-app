package com.example.mediaawesomeapp.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Album(
    val id: String,
    @SerializedName("raw_id")
    val rawId: Long? = null,
    val link: String? = null,
    val title: String? = null,
    @SerializedName("isoffical")
    val isOfficial: Boolean? = null,
    @SerializedName("play_item_mode")
    val playItemMode: Int? = null,
    @SerializedName("isalbum")
    val isAlbum: Boolean? = null,
    @SerializedName("is_single")
    val isSingle: Boolean? = null,
    @SerializedName("is_shuffle")
    val isShuffle: Boolean? = null,
    @SerializedName("release_date")
    val releaseDate: String? = null,
    @SerializedName("artists_names")
    val artistsNames: String? = null,
    val artists: List<Artist>? = null,
    val sybType: Int? = null,
    val thumbnail: String? = null,
    @SerializedName("thumbnail_medium")
    val thumbnailMedium: String? = null,
    val listen: Long? = null,
    val privacy: String? = null,
    val uid: String? = null,
    @SerializedName("user_name")
    val username: String? = null,
    @SerializedName("total_song")
    val totalSong: Long? = null
) : Parcelable