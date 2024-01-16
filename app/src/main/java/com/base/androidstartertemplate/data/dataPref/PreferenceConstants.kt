package com.base.androidstartertemplate.data.dataPref


/**
 * Created by Abhishek Shah on 15 November 2022
 *
 * Thinkitive Technologies Pvt. Ltd.
 */
class PreferenceConstants {
    companion object {

        /**
         * Provides the class name as TAG variable whenever required.
         *
         * Mostly used for Logging the data in LogCat.
         */
        private const val TAG = "PreferenceConstants"

        /**
         * Shared Preferences Name for Preferences File to be used when any data related to the Firebase is to
         * be stored in the Shared Preferences.
         */
        const val FIREBASE_PREFERENCE = "firebase_preference"

        /**
         * Shared Preferences Name for Preferences File to be used when ny data related to the application
         * is to be stored in the Shared Preferences.
         */
        const val APPLICATION_PREFERENCE = "application_preference"

        /**
         * Shared Preferences Key for the Firebase Cloud Messaging Services token to be stored or
         * retrieved from the respective Shared Preferences File.
         */
        const val FIREBASE_NOTIFICATION_TOKEN = "firebase_notification_token"

        const val LOGIN_PREFERENCE = "login_preference"
        const val USER_INFO_PREFERENCE = "user_info_preference"
        const val CGMACTIVATIONKEY = "cgm_activationkey"
        const val CGMACTIVATIONNAME = "cgm_activation_name"
        const val ISCGMACTIVEKEY = "is_cgm_active_key"
        const val ISCGMACTIVENAME = "is_cgm_active_name"

        const val GET_LOGIN_INFO = "get_login_info"

        const val GET_USER_INFO = "get_user_info"

        const val IS_FITBIT_ESTABLISHED = "IS_FITBIT_ESTABLISHED"

        const val NOTIFICATIONS_SETTINGS = "notifications_settings"

//        const val HIDE_HABITS_TOOLTIP = "hide_habits_tooltip"
//
//        const val HIDE_COACHING_TOOLTIP = "hide_coaching_tooltip"
    }
}