package com.example.mediaawesomeapp.model

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created at 2020-02-03 by Sang
 */
@Entity(tableName = "song", ignoredColumns = ["picture"])
data class Song(
    @PrimaryKey @ColumnInfo(name = "song_id") var id: Long,
    @ColumnInfo(name = "name", index = true) var name: String? = null,
    @ColumnInfo(name = "short_name") var shortName: String? = null,
    val picture: Bitmap? = null
){

    constructor(): this(0)
}
