package com.example.mediaawesomeapp.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Artist(
    val id: String,
    val name: String? = null,
    val link: String? = null,
    val cover: String? = null,
    val thumbnail: String? = null,
    val spotlight: Boolean? = null,
    val follow: Long? = null,
    @SerializedName("oa_link")
    val oaLink: String? = null,
    val biography: String? = null,
    val national: String? = null,
    val birthday: String? = null,
    @SerializedName("realname")
    val realName: String? = null,
    val song: ArtistSong? = null,
    val album: ArtistAlbum? = null,
    val video: ArtistVideo? = null,
    val recommends: List<Artist>? = null,
    val followed: Boolean? = null
) : Parcelable

@Parcelize
class ArtistSong: BaseTotalModel<Song>(), Parcelable

@Parcelize
class ArtistAlbum: BaseTotalModel<Album>(), Parcelable

@Parcelize
class ArtistVideo: BaseTotalModel<Video>(), Parcelable