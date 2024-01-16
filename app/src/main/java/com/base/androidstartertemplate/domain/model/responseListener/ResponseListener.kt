package com.base.androidstartertemplate.domain.model.responseListener

import com.base.androidstartertemplate.domain.model.manager.ErrorModel
import java.lang.Error

interface ResponseListener<T> {
    fun onResponseReceived(response: T, requestCode : Int)
    fun onErrorReceived(error: ErrorModel, requestCode: Int)
    fun onLoading(isLoading : Boolean){}
}