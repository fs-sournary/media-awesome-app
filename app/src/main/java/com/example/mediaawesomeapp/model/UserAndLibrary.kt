package com.example.mediaawesomeapp.model

import androidx.room.Embedded
import androidx.room.Relation
import com.example.mediaawesomeapp.db.RelationDao

/**
 * Created at 2020-02-08 by Sang
 *
 * In Room, one-to-one relationship between two entities: 1 [User] <-> 1 [Library].
 * Dao method: [RelationDao.getUsersAndLibraries].
 */
data class UserAndLibrary(
    @Embedded val user: User,
    @Relation(parentColumn = "user_id", entityColumn = "user_own_id") val library: Library
)
