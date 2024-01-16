package com.base.androidstartertemplate

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.base.androidstartertemplate.presentation.modules.home.screens.navScreens.MainScreen
import com.base.androidstartertemplate.themes.theme.AppTheme
import com.base.androidstartertemplate.utility.BaseActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                val navController = rememberNavController()

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = AppTheme.colors.secondary
                ) {
                    MainScreenUI(navController = navController)
                }
            }
        }


    }

@Composable
fun MainScreenUI(navController : NavHostController){
    Surface(modifier = Modifier.fillMaxSize()) {
        MainScreen(navController = navController)
    }
}

    @Preview
    @Composable
    fun Preview(){

    }
}



