package com.base.androidstartertemplate.presentation.modules.login.data.model


data class LoginPatientsResponse (


    var statusCode : String? = null,
    var message : String? = null,
    var data: LoginPatientData?

):java.io.Serializable


data class LoginPatientData(

    var access_token:String,
    var refresh_token:String,
    var refresh_expires_in:Long,
    var token_type:String,
    var expires_in:Int,
    var id:String,
) {
    fun getToken(): String {
//        TODO("Not yet implemented")
        return "$token_type $access_token"
    }
}
