package com.base.androidstartertemplate.presentation.modules.login.data.model

data class SignUpResponse(
    var statusCode: String? = null,
    var status: String? = null,
    var message: String? = null,
    var data: Data? = null
) : java.io.Serializable

data class Data(
    var id: String? = null
)
