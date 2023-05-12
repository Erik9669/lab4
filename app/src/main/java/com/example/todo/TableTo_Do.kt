package com.example.todo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "To_Do")
data class TableTo_Do(
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    var title:String,
    var priority:String
)