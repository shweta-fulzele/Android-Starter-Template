package com.base.androidstartertemplate.data.dataPref

import android.content.Context
import android.content.SharedPreferences
import com.base.androidstartertemplate.presentation.modules.login.data.model.LoginPatientData
import com.base.androidstartertemplate.presentation.modules.login.data.model.UserDetailsRes
import com.google.gson.Gson

/**
 * Created by Shweta Fulzele on 16 Jan 2024
 */
class PreferenceManager {
    companion object {
        private const val TAG = "PreferenceManager"
        private const val MODE = Context.MODE_PRIVATE

        /**
         * This function reads the stored firebase cloud messaging service device token from the
         * shared preferences and returns it to the caller functions.
         *
         * @param context The context from which the function is being called
         *
         * @param preferenceKey The key used for storing and accessing the stored firebase
         * messaging token.
         *
         * @param defaultValue The value to be returned if the token is not available or
         * accessible in the shared preferences.
         * The default value can be null as the function is capable of returning a null value.
         *
         * @param preferenceName The Shared Preference Name from which the data is to be read
         * and accessed in the shared preferences.
         * The default value of the preferenceName is set to the Firebase Shared Preference
         * name [PreferenceConstants.FIREBASE_PREFERENCE] and can be changed if required.
         *
         * @return A [String] value which represents the Firebase Cloud Messaging Token.
         *
         * @author Shweta Fulzele
         */
        fun retrieveFirebaseToken(
            context: Context,
            preferenceKey: String,
            defaultValue: String? = null,
            preferenceName: String = PreferenceConstants.FIREBASE_PREFERENCE
        ): String? {
            return getSharedPreferences(context = context, preferenceName)?.getString(
                preferenceKey,
                defaultValue
            )
        }

        /**
         * This function stores the firebase cloud messaging service device token to the
         * shared preferences.
         *
         * @param context The context from which the function is being called
         *
         * @param preferenceKey The key used for storing and accessing the stored firebase
         * messaging token.
         *
         * @param value The value to be stored to the shared preference for the specified key.
         *
         * @param preferenceName The Shared Preference Name from which the data is to be read
         * and accessed in the shared preferences.
         * The default value of the preferenceName is set to the Firebase Shared Preference
         * name [PreferenceConstants.FIREBASE_PREFERENCE] and can be changed if required.
         *
         * @see retrieveFirebaseToken
         *
         * @author Shweta Fulzele
         */
        fun saveFirebaseToken(
            context: Context,
            preferenceKey: String,
            value: String,
            preferenceName: String = PreferenceConstants.FIREBASE_PREFERENCE
        ) {
            getPreferenceEditor(context = context, preferenceName)?.putString(preferenceKey, value)
                ?.commit()
        }

        fun storeLoginInfo(
            context: Context,
            preferenceKey: String = PreferenceConstants.GET_LOGIN_INFO,
            value: LoginPatientData,
            preferenceName: String = PreferenceConstants.LOGIN_PREFERENCE
        ) {
            getPreferenceEditor(context = context, preferenceName)?.putString(
                preferenceKey,
                Gson().toJson(value)
            )?.commit()
        }

        fun getLoginInfo(
            context: Context,
            preferenceKey: String = PreferenceConstants.GET_LOGIN_INFO,
            defaultValue: String?,
            preferenceName: String = PreferenceConstants.LOGIN_PREFERENCE
        ): LoginPatientData? {
            return Gson().fromJson(
                getSharedPreferences(
                    context = context,
                    preferenceName
                )?.getString(preferenceKey, defaultValue), LoginPatientData::class.java
            )
        }

        fun storeUserInfo(
            context: Context,
            preferenceKey: String = PreferenceConstants.GET_USER_INFO,
            value: UserDetailsRes,
            preferenceName: String = PreferenceConstants.LOGIN_PREFERENCE
        ) {
            getPreferenceEditor(context = context, preferenceName)?.putString(
                preferenceKey,
                Gson().toJson(value)
            )?.commit()
        }
        fun getUserInfo(
            context: Context,
            preferenceKey: String = PreferenceConstants.GET_USER_INFO,
            defaultValue: String?,
            preferenceName: String = PreferenceConstants.LOGIN_PREFERENCE
        ): UserDetailsRes? {
            return Gson().fromJson(
                getSharedPreferences(
                    context = context,
                    preferenceName
                )?.getString(preferenceKey, defaultValue), UserDetailsRes::class.java
            )
        }
        fun clearLoginData(
            context: Context,
            preferenceName: String = PreferenceConstants.LOGIN_PREFERENCE
        ) {
            getPreferenceEditor(context = context, preferenceName)?.clear()?.commit()
        }
        
        private fun getSharedPreferences(
            context: Context,
            preferenceName: String
        ): SharedPreferences? {
            return context.getSharedPreferences(preferenceName, MODE)
        }

        private fun getPreferenceEditor(
            context: Context,
            preferenceName: String
        ): SharedPreferences.Editor? {
            return getSharedPreferences(context, preferenceName)?.edit()
        }

        fun storeData(
            context: Context,
            preferenceKey: String,
            value: String,
            preferenceName: String = PreferenceConstants.APPLICATION_PREFERENCE
        ) {
            getPreferenceEditor(context = context, preferenceName)?.putString(preferenceKey, value)
                ?.commit()
        }

        fun getData(
            context: Context,
            preferenceKey: String,
            defaultValue: String?,
            preferenceName: String = PreferenceConstants.APPLICATION_PREFERENCE
        ): String? {
            return getSharedPreferences(context = context, preferenceName)?.getString(
                preferenceKey,
                defaultValue
            )
        }

    }
}