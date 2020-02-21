package com.example.mediaawesomeapp.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Home(
    @SerializedName("song_new")
    val songNew: SongNew? = null,
    val banner: List<Song>? = null,
    @SerializedName("topic_hot")
    val topicHot: List<TopicHot>? = null,
    @SerializedName("music_theme")
    val musicTheme: MusicTheme? = null,
    @SerializedName("video_hot")
    val videoHot: VideoHot? = null,
    @SerializedName("artist_hot")
    val artistHot: List<Artist>? = null,
    @SerializedName("album_hot")
    val albumHot: AlbumHot? = null,
    @SerializedName("genre_shortcut")
    val genreShortcuts: List<GenreShortcut>? = null,
    val chart: Chart? = null,
    val spotlight: Spotlight? = null,
    val top100: Top100? = null,
    val zma: Zma? = null

) : Parcelable

@Parcelize
class TopicHot : BaseItemsModel<Album>(), Parcelable

@Parcelize
class MusicTheme : BaseItemsModel<Album>(), Parcelable

@Parcelize
class VideoHot : BaseItemsModel<Song>(), Parcelable

@Parcelize
class Top100 : BaseItemsModel<Album>(), Parcelable

@Parcelize
class AlbumHot : BaseItemsModel<Album>(), Parcelable

@Parcelize
class SongNew : BaseItemsModel<Song>(), Parcelable