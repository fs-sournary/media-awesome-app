package com.example.mediaawesomeapp.db

import androidx.room.Dao
import androidx.room.Query
import com.example.mediaawesomeapp.model.Music
import io.reactivex.Flowable

/**
 * Created at 2020-02-03 by Sang
 */
@Dao
interface MusicDao : BaseDao<Music> {

    /**
     * Get all music
     */
    @Query("SELECT * FROM Music")
    fun getAllMusics(): Flowable<List<Music>>

    /**
     * Get Music by id.
     */
    @Query("SELECT * FROM Music ")
    fun getMusicById(id: String): Flowable<Music>

    /**
     * Delete all music.
     */
    @Query("DELETE FROM Music")
    fun deleteAllMusics()
}
