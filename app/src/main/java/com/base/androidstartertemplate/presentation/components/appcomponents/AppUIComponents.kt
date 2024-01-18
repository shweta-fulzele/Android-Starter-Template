package com.base.androidstartertemplate.presentation.components.appcomponents

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable

class AppUIComponents {
    companion object {
        @Composable
        fun ShowToast(message: String, context: Context) {
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show()

        }
    }
}