package com.example.mediaawesomeapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

/**
 * Created at 2020-02-08 by Sang
 */
@Entity(tableName = "library")
data class Library(
    @PrimaryKey @SerializedName("library_id") var id: Int,
    @ColumnInfo(name = "user_own_id") var userOwnId: Int? = null
)
