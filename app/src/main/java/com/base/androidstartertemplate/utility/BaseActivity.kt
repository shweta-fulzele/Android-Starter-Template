package com.base.androidstartertemplate.utility

import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.net.wifi.WifiManager
import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.annotation.RequiresApi
import com.base.androidstartertemplate.receiver.AirplaneModeChangeReceiver
import com.base.androidstartertemplate.receiver.NetworkStateReceiver
import com.google.firebase.FirebaseApp
import com.google.firebase.crashlytics.FirebaseCrashlytics

open class BaseActivity: ComponentActivity() {

    private var networkStateReceiver: NetworkStateReceiver? = null
    private lateinit var airplaneModeStateReceiver: AirplaneModeChangeReceiver
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

    }

    override fun onResume() {
        super.onResume()

        airplaneModeStateReceiver = AirplaneModeChangeReceiver()

        FirebaseApp.initializeApp(applicationContext)
        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true)

        val intentFilter = IntentFilter()
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION)
        intentFilter.addAction(WifiManager.WIFI_STATE_CHANGED_ACTION)
        intentFilter.addAction(WifiManager.NETWORK_STATE_CHANGED_ACTION)

        if (networkStateReceiver == null) {
            networkStateReceiver = NetworkStateReceiver()
        }
        registerReceiver(networkStateReceiver, intentFilter)


//        Airplane mode change receiver
        // Intent Filter is useful to determine which apps wants to receive
        // which intents,since here we want to respond to change of
        // airplane mode
        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            // registering the receiver
            // it parameter which is passed in  registerReceiver() function
            // is the intent filter that we have just created
            registerReceiver(airplaneModeStateReceiver, it, RECEIVER_NOT_EXPORTED)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(networkStateReceiver)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()

        unregisterReceiver(airplaneModeStateReceiver)

    }

}