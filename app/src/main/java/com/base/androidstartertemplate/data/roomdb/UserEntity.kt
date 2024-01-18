package com.base.androidstartertemplate.data.roomdb

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "users")
    data class User(
        @PrimaryKey(autoGenerate = true)
        val id: Long = 0,
        val username: String,
        val password: String
    )
