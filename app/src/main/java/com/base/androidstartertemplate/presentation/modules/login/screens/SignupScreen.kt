package com.base.androidstartertemplate.presentation.modules.login.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.base.androidstartertemplate.data.roomdb.User
import com.base.androidstartertemplate.data.roomdb.UserDao
import com.base.androidstartertemplate.presentation.components.appcomponents.AppUIComponents.Companion.ShowToast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


    @Composable
    fun SignupScreenUI(userDao : UserDao) {

        Surface(modifier = Modifier
            .fillMaxSize()
            .background(Color.White), color = Color.White) {
            // Sign Up Button Click Listener
            Button(
                onClick = {
                    val username = ""
                    val password = ""

                    GlobalScope.launch(Dispatchers.IO) {
                        // Check if the username already exists
                        val existingUser = userDao.checkUsernameExists(username)
                        if (existingUser == null) {
                            // If username doesn't exist, sign up the user
                            val newUser = User(username = username, password = password)
                            userDao.insertUser(newUser)
                            println("User registered successfully!")
                        } else {
                            println("Username already exists. Please choose a different one.")
                        }
                    }
                }, modifier = Modifier
                    .fillMaxWidth()
                    .height(30.dp)

            ) {
                Text(text = "SignUp")

            }
        }


    }
