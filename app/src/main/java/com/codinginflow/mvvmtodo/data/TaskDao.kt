package com.codinginflow.mvvmtodo.data

import androidx.room.Dao
/*
 with Dao we can make operations on the DB table
 Room does not allow execution on the main thread
 */
@Dao
interface TaskDao {
    suspend fun insert(task: Task)

}