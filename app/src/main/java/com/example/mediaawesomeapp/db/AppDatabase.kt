package com.example.mediaawesomeapp.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mediaawesomeapp.model.*

/**
 * Created at 2020-02-09 by Sang
 */
@Database(
    entities = [Library::class, PlayList::class, PlayListAndSongRef::class, Song::class, User::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getRelationDao(): RelationDao

    abstract fun getSongDao(): SongDao

    companion object {

        // Single prevents multi instances of database opening at same time in multi threads.
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            if (INSTANCE != null) return INSTANCE!!
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext, AppDatabase::class.java, "app_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
