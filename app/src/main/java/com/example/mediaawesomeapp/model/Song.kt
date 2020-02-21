package com.example.mediaawesomeapp.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

/**
 * Created at 2020-02-03 by Sang
 */
@Parcelize
@Entity(tableName = "song", ignoredColumns = ["artists", "genres", "composers", "album", "contentOwner", "lyrics", "streaming"])
data class Song(
    @PrimaryKey @ColumnInfo(name = "song_id")
    var id: String,
    @ColumnInfo(index = true)
    var title: String? = null,
    val artists: List<Artist>? = null,
    @SerializedName("artists_names")
    var artistsNames: String? = null,
    @SerializedName("raw_id")
    var rawId: Long? = null,
    var alias: String? = null,
    @SerializedName("is_zma")
    var isZma: Boolean? = null,
    var link: String? = null,
    var thumbnail: String? = null,
    var isOfficial: Boolean? = null,
    @SerializedName("zing_choise")
    var zingChoice: Boolean? = null,
    @SerializedName("allow_audio_ads")
    var allowAudioAds: Boolean? = null,
    @SerializedName("thumbnail_medium")
    var thumbnailMedium: String? = null,
    var lyric: String? = null,
    var listen: Long? = null,
    @SerializedName("status_name")
    var statusName: String? = null,
    @SerializedName("status_code")
    var statusCode: Int? = null,
    @SerializedName("created_at")
    var createdAt: Long? = null,
    @SerializedName("released_at")
    var releasedAt: Long? = null,
    var privacy: String? = null,
    @SerializedName("streaming_status")
    var streamingStatus: Int? = null,
    var isVN: Boolean? = null,
    var duration: Long? = null,
    @SerializedName("public_status")
    var publicStatus: Int? = null,
    @SerializedName("is_worldwide")
    var isWorldwide: Boolean? = null,
    @SerializedName("userid")
    var userId: Long? = null,
    val genres: List<Genre>? = null,
    val album: Album? = null,
    val composers: List<Composer>? = null,
    @SerializedName("content_owner")
    val contentOwner: ContentOwner? = null,
    val lyrics: List<Lyric>? = null,
    var like: Long? = null,
    val streaming: Streaming? = null
) : Parcelable {
    constructor(): this("1")
}
