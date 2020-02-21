package com.example.mediaawesomeapp.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Video(
    val id: String,
    val title: String? = null,
    val artists: List<Artist>? = null,
    @SerializedName("artists_names")
    val artistsNames: String? = null,
    @SerializedName("raw_id")
    val rawId: Long? = null,
    val link: String? = null,
    val thumbnail: String? = null,
    @SerializedName("thumbnail_medium")
    val thumbnailMedium: String? = null,
    val listen: Long? = null,
    @SerializedName("start_time")
    val startTime: Long? = null,
    @SerializedName("end_time")
    val endTime: Long? = null,
    @SerializedName("status_name")
    val statusName: String? = null,
    @SerializedName("status_code")
    val statusCode: Int? = null,
    @SerializedName("created_at")
    val createdAt: Long? = null,
    val privacy: String? = null,
    @SerializedName("zing_choise")
    val zingChoice: Boolean? = null,
    @SerializedName("streaming_status")
    val streamingStatus: Int? = null,
    val isVN: Boolean? = null,
    @SerializedName("ads_disabled")
    val adsDisabled: Boolean? = null
) : Parcelable