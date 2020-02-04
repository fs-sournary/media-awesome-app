package com.example.mediaawesomeapp.db

import androidx.room.Dao
import androidx.room.Query
import com.example.mediaawesomeapp.model.Song
import io.reactivex.Flowable

/**
 * Created at 2020-02-03 by Sang
 */
@Dao
interface SongDao : BaseDao<Song> {

    /**
     * Get all music
     */
    @Query("SELECT * FROM song")
    fun getAllSongs(): Flowable<List<Song>>

    /**
     * Get Song by id.
     */
    @Query("SELECT * FROM song WHERE song_id = :id")
    fun getSongById(id: String): Flowable<Song>

    /**
     * Delete all music.
     */
    @Query("DELETE FROM song")
    fun deleteAllSongs()
}
