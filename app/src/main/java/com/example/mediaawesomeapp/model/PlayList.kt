package com.example.mediaawesomeapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created at 2020-02-08 by Sang
 */
@Entity(tableName = "play_list")
data class PlayList(
    @PrimaryKey @ColumnInfo(name = "play_list_id") var id: Long,
    @ColumnInfo(name = "user_create_id") var userCreateId: Long? = null,
    var name: String? = null
)
