package com.base.androidstartertemplate.domain.model.request

import com.base.androidstartertemplate.domain.model.Paging
import com.google.gson.annotations.SerializedName

class BaseResponse<T> {

    @SerializedName("timestamp")
    var timestamp: String? = null

    @SerializedName("statusCode")
    var statusCode: Int? = null

    @SerializedName("status")
    var status: String? = null

    @SerializedName("message")
    var message: String? = null

    @SerializedName("data")
    var data: T? = null

    @SerializedName("paging")
    var paging: Paging? = Paging()

}