package com.example.todo
import androidx.room.*
@Dao
interface dao {
    @Insert
    suspend fun inserObject(tableToDo: TableTo_Do)
    @Delete
    suspend fun CompleteObject(tableToDo: TableTo_Do)
    @Query("Select * from to_do")
    suspend fun getObject():List<ObjectInfo>
}