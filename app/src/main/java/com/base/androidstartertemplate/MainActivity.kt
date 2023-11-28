package com.base.androidstartertemplate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.base.androidstartertemplate.presentation.components.WelcomeText
import com.base.androidstartertemplate.ui.theme.AppTheme
import com.base.androidstartertemplate.ui.theme.AppTypography
import com.base.androidstartertemplate.utility.BaseActivity
import com.base.androidstartertemplate.utility.addExclamation
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Shweta")
                }
            }
        }


    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        val systemUiController = rememberSystemUiController()
        val iconsDark = !isSystemInDarkTheme()

        LaunchedEffect(Unit) {
            systemUiController.setStatusBarColor(Color.Transparent, darkIcons = iconsDark)
            systemUiController.setNavigationBarColor(Color.Transparent, darkIcons = iconsDark)
        }
        val modifiedString = name.addExclamation()
        WelcomeText(text = "Welcome $modifiedString", modifier = modifier)
    }

    @Preview
    @Composable
    fun Preview(){
        Greeting("World!")
    }
}



