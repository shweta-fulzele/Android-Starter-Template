package com.base.androidstartertemplate.receiver

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import androidx.lifecycle.MutableLiveData

class NetworkStateReceiver: BroadcastReceiver() {
    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    override fun onReceive(context: Context, intent: Intent?) {
//        TODO("Functions When the Network State has been changed")
        context.let {
            val connectivityManager = it.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val activeNetwork = connectivityManager.activeNetwork
            val networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)
            isUserConnected.value =
                networkCapabilities?.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)?: false
                        || networkCapabilities?.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)?: false
        }
    }

    companion object {

        private const val TAG = "NetworkStateReceiver"

        @JvmStatic
        var isUserConnected = MutableLiveData<Boolean>()
            private set
    }
}