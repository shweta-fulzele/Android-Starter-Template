package com.base.androidstartertemplate.presentation.modules.login.screens

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import com.base.androidstartertemplate.data.roomdb.AppDatabase
import com.base.androidstartertemplate.data.roomdb.UserDao
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class LoginScreen {

    private lateinit var userDao: UserDao

    @OptIn(DelicateCoroutinesApi::class)
    @Composable
    fun LoginScreenUI(context: Context) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White), color = Color.White
        ) {
            userDao = AppDatabase.getInstance(context).userDao()

            Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {


                // Login Button Click Listener
                Button(
                    onClick = {
                        val username = ""
                        val password = ""

                        GlobalScope.launch(Dispatchers.IO) {
                            val loggedInUser = userDao.loginUser(username, password)
                            if (loggedInUser != null) {
                                println("Login successful!")
                            } else {
                                println("Invalid username or password. Please try again.")
                            }
                        }
                    }, modifier = Modifier
                        .fillMaxWidth()
                        .height(30.dp)

                ) {
                    Text(text = "Login")

                }
                
                SignupScreenUI(userDao = userDao)
            }

        }


    }
}


