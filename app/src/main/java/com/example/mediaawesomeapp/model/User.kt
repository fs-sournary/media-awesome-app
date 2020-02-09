package com.example.mediaawesomeapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created at 2020-02-08 by Sang
 */
@Entity(tableName = "user")
data class User(
    @PrimaryKey @ColumnInfo(name = "user_id") var id: Long,
    var age: Int? = null,
    var name: String? = null
)
