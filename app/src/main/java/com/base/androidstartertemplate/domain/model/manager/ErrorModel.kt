package com.base.androidstartertemplate.domain.model.manager

import java.sql.Timestamp

class ErrorModel {
    var errorCode: Int = 0
    var errorMessage: ErrorMessageJson? = null
    var message: String = ""
    override fun toString(): String {
        return "ErrorModel(errorCode=$errorCode, errorMessage=$errorMessage, message='$message')"
    }


}

data class ErrorMessageJson(
    val timestamp: String,
    val status: String,
    val statusCode: Int,
    val message: String
) {

}