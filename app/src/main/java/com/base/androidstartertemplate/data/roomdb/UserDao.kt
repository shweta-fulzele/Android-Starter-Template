package com.base.androidstartertemplate.data.roomdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface UserDao {
    @Insert
    suspend fun insertUser(user: User)

    @Query("SELECT * FROM users WHERE username = :username AND password = :password")
    suspend fun loginUser(username: String, password: String): User?

    @Query("SELECT * FROM users WHERE username = :username")
    suspend fun checkUsernameExists(username: String): User?
}