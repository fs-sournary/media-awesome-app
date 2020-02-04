package com.example.mediaawesomeapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity

/**
 * Created at 2020-02-08 by Sang
 *
 * In Room, many-to-many relationship between [PlayList] and [Song].
 * zero or more [PlayList] <-> zero or more [Song].
 */
@Entity(tableName = "play_list_and_song", primaryKeys = ["play_list_id", "song_id"])
data class PlayListAndSongRef(
    @ColumnInfo(name = "play_list_id") var playListId: Long,
    @ColumnInfo(name = "song_id") var songId: Long
)
