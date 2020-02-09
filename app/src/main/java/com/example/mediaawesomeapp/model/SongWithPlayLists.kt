package com.example.mediaawesomeapp.model

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.mediaawesomeapp.db.RelationDao

/**
 * Created at 2020-02-08 by Sang
 *
 * Many-to-many relationship: 1 [Song] -> zero or more [PlayList].
 * Dao method: [RelationDao.getSongsWithPlayLists].
 */
data class SongWithPlayLists(
    @Embedded val song: Song,
    @Relation(
        parentColumn = "song_id",
        entityColumn = "play_list_id",
        associateBy = Junction(value = PlayListAndSongRef::class)
    )
    val playLists: List<PlayList>
)
