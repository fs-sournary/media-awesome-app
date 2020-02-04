package com.example.mediaawesomeapp.db

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

/**
 * Created at 2020-02-03 by Sang
 */
interface BaseDao<T> {

    /**
     * Insert obj-T object in the database.
     */
    @Insert
    fun insert(obj: T)

    /**
     * Insert obj array of T objects in the database.
     */
    @Insert
    fun insert(vararg obj: T)

    /**
     * Update obj-T object in the database.
     */
    @Update
    fun update(obj: T)

    /**
     * Delete obj-T object in the database.
     */
    @Delete
    fun delete(obj: T)
}
