package com.base.androidstartertemplate.domain.responseListener

import com.base.androidstartertemplate.domain.manager.ErrorModel
import java.lang.Error

interface ResponseListener<T> {
    fun onResponseReceived(response: T, requestCode : Int)
    fun onErrorReceived(error: ErrorModel, requestCode: Int)
    fun onLoading(isLoading : Boolean){}
}