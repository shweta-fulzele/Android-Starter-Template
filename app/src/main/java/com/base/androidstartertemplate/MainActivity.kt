package com.base.androidstartertemplate

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.base.androidstartertemplate.presentation.components.TitleBold
import com.base.androidstartertemplate.ui.theme.AppTheme
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
                    color = AppTheme.colors.secondary
                ) {
                    Greeting("Demo")
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
        TitleBold(text = "Welcome $modifiedString", modifier = modifier)
    }

    @Preview
    @Composable
    fun Preview(){
        Greeting("World!")
    }
}



