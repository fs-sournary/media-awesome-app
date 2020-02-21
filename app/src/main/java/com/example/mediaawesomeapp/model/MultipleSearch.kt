package com.example.mediaawesomeapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MultipleSearch(
    val artist: SearchArtist? = null,
    val song: SearchSong? = null,
    val video: SearchVideo? = null,
    val playlist: SearchPlaylist? = null
) : Parcelable

@Parcelize
class SearchArtist : BaseItemsModel<Artist>(), Parcelable

@Parcelize
class SearchSong : BaseItemsModel<Song>(), Parcelable

@Parcelize
class SearchVideo : BaseItemsModel<Video>(), Parcelable

@Parcelize
class SearchPlaylist : BaseItemsModel<Album>(), Parcelable