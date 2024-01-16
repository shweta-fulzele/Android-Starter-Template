package com.base.androidstartertemplate.domain.retrofit

import android.content.Context
import com.base.androidstartertemplate.BuildConfig
import com.base.androidstartertemplate.data.api.ApiService
import retrofit2.create

class ApiUtils {

    companion object {
        const val BASE_URL = BuildConfig.BASE_URL
    }

    fun getApiServices(context: Context) : ApiService {
        return RetrofitClient.getRetrofitClient(BASE_URL, context).create(ApiService ::class.java)
    }
}