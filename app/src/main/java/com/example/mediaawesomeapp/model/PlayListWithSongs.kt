package com.example.mediaawesomeapp.model

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.mediaawesomeapp.db.RelationDao

/**
 * Created at 2020-02-08 by Sang
 *
 * Many-to-many relationship: 1 [PlayList] -> zero or more [Song].
 * Dao method: [RelationDao.getPlayListsWithSongs].
 */
data class PlayListWithSongs(
    @Embedded val playList: PlayList,
    @Relation(
        parentColumn = "play_list_id",
        entityColumn = "song_id",
        associateBy = Junction(value = PlayListAndSongRef::class)
    )
    val songs: List<Song>
)
