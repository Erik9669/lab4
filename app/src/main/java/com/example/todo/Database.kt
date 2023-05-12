package com.example.todo
import androidx.room.Database
import androidx.room.RoomDatabase
@Database(entities = [TableTo_Do::class],version=1)
abstract class Database : RoomDatabase() {
    abstract fun dao():dao
}