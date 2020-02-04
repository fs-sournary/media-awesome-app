package com.example.mediaawesomeapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created at 2020-02-03 by Sang
 */
@Entity(tableName = "Music")
data class Music(@PrimaryKey val id: String, val name: String)
