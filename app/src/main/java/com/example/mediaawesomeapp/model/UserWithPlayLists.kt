package com.example.mediaawesomeapp.model

import androidx.room.Embedded
import androidx.room.Relation
import com.example.mediaawesomeapp.db.RelationDao

/**
 * Created at 2020-02-08 by Sang
 *
 * In Room, one-to-many relationship between [User] and [PlayList].
 * 1 [User] -> zero or more [PlayList] and 1 [PlayList] -> 1 [User].
 * Dao method: [RelationDao.getUserWithPlayLists]
 */
data class UserWithPlayLists(
    @Embedded val user: User,
    @Relation(parentColumn = "user_id", entityColumn = "user_create_id")
    val playLists: List<PlayList>
)
