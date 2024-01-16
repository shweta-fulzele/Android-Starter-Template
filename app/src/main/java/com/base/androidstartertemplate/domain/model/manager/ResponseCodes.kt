package com.base.androidstartertemplate.domain.model.manager

class ResponseCodes {
    companion object {
        /** System Level Response Codes Starts Here **/

        /** The Constant Success.  */
        const val SUCCESS = 200

        /** The Constant Success.  */
        const val ACCEPTED = 201

        /** The Constant AccessToken expired.  */
        const val ACCESS_TOKEN_EXPIRED = 401

        /** The Constant RefreshToken expired.  */
        const val REFRESH_TOKEN_EXPIRED = 400

        /** The Constant InvalidUseridPassword  */
        const val BAD_REQUEST = 400


        // Error Codes
        const val REQUEST_CANCEL = -1

        const val RESPONSE_JSON_NOT_VALID = 1

        const val MODEL_TYPE_CAST_EXCEPTION = 2

        const val INTERNET_NOT_AVAILABLE = 3

        const val WRONG_URL = 4

        const val WRONG_METHOD_NAME = 5

        const val URL_CONNECTION_ERROR = 6

        const val UNKNOWN_ERROR = 10

        private const val NOT_ALLOWED = 403


        fun logErrorMessage(code: Int): String {
            lateinit var errorMessage: String
            when (code) {
                REQUEST_CANCEL -> errorMessage = "Request Canceled"

                INTERNET_NOT_AVAILABLE -> errorMessage =
                    "Internet connection is not available. Please check it and try again"

                WRONG_URL -> errorMessage =
                    "You are trying to hit wrong url, Please check it and try again"

                WRONG_METHOD_NAME -> errorMessage =
                    "You are passing wrong method name. i.e POST, GET, DELETE etc"

                URL_CONNECTION_ERROR -> errorMessage =
                    "Connection is not established, Please try again"

                RESPONSE_JSON_NOT_VALID -> errorMessage = "Json you are getting is not valid"

                MODEL_TYPE_CAST_EXCEPTION -> errorMessage =
                    "Server is not working. Please try after some time."

                NOT_ALLOWED -> errorMessage = "Server is not working. Please try after some time."

                else -> errorMessage = "Unknown error"
            }
            return errorMessage
        }
    }
}