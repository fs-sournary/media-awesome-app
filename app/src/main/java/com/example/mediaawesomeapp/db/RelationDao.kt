package com.example.mediaawesomeapp.db

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.example.mediaawesomeapp.model.*
import io.reactivex.Flowable

/**
 * Created at 2020-02-08 by Sang
 */
@Dao
interface RelationDao {

    /**
     * One-to-one relationship: get list of 1 [User] and corresponding list of [Library].
     */
    @Transaction
    @Query("SELECT * FROM user")
    fun getUsersAndLibraries(): Flowable<List<UserAndLibrary>>

    /**
     * One-to-many relationship: get list of 1 [User] and corresponding list of [PlayList].
     */
    @Transaction
    @Query("SELECT * FROM user")
    fun getUserWithPlayLists(): Flowable<List<UserWithPlayLists>>

    /**
     * Many-to-many relationship: get list of 1 [Song] and corresponding list of [PlayList].
     */
    @Transaction
    @Query("SELECT * FROM song")
    fun getSongsWithPlayLists(): Flowable<List<SongWithPlayLists>>

    /**
     * Many-to-many relationship: get list of 1 [PlayList] and corresponding list of [Song]
     */
    @Transaction
    @Query("SELECT * FROM play_list")
    fun getPlayListsWithSongs(): Flowable<List<PlayListWithSongs>>
}
