package com.base.androidstartertemplate.data.dataPref

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.base.androidstartertemplate.presentation.modules.login.data.model.LoginPatientData
import com.base.androidstartertemplate.presentation.modules.login.data.model.UserDetailsRes
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

/**
 * Created by Shweta Fulzele on 16 January 2024
 *
 */

class AppInstance(private val context: Context) {
    companion object {
        private val Context.dataStore: DataStore<Preferences> by preferencesDataStore("userToken")
        private val USER_TOKEN_KEY = stringPreferencesKey("user_token")

        fun getLogin(context: Context): LoginPatientData? {
            return PreferenceManager.getLoginInfo(context = context, defaultValue = "")
        }

        fun getUserInfo(context: Context): UserDetailsRes? {
            return PreferenceManager.getUserInfo(context = context, defaultValue = "")
        }

        var user: UserDetailsRes? = null
    }

    val getAccessToken: Flow<String> = context.dataStore.data.map { preference ->
        preference[USER_TOKEN_KEY] ?: ""
    }

    suspend fun saveToken(token: String) {
        context.dataStore.edit { preference ->
            preference[USER_TOKEN_KEY] = token
        }
    }


}

