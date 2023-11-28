package com.base.androidstartertemplate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import com.base.androidstartertemplate.presentation.ui.theme.AndroidBaseStructureTheme
import com.base.androidstartertemplate.utility.networkstate.ConnectivityObserver
import com.base.androidstartertemplate.utility.networkstate.NetworkConnectivityObserver
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class MainActivity : ComponentActivity() {

    private lateinit var connectivityObserver: ConnectivityObserver
    private lateinit var status : ConnectivityObserver.Status
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        connectivityObserver = NetworkConnectivityObserver(applicationContext)
        connectivityObserver.observe().onEach {
            status = it
        }.launchIn(lifecycleScope)


        setContent {
            AndroidBaseStructureTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

//                    val status by connectivityObserver.observe().collectAsState(initial = ConnectivityObserver.Status.Unavailable)

//
//                    Box(modifier = Modifier.fillMaxWidth()){
//                        Text(text = "Network is ${status.name}")
//                    }
                    Greeting("Hello World!")
                }
            }
        }


    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }

    @Preview
    @Composable
    fun Preview(){
        Greeting("World!")
    }
}



