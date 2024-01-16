package com.base.androidstartertemplate.data.api

import com.base.androidstartertemplate.domain.model.request.BaseResponse
import com.base.androidstartertemplate.presentation.modules.login.data.model.SignUpResponse
import com.base.androidstartertemplate.presentation.modules.login.data.model.LoginPatientsResponse
import com.google.gson.JsonObject
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {

    @Headers("Content-Type: application/json")
    @POST("login/patients")
    fun login(
        @Body body: JsonObject
    ): Observable<LoginPatientsResponse>

    @POST("")
    fun logout(
        @Header("Authorization") token: String,
        @Body body: JsonObject
    ): Observable<BaseResponse<String?>>


    @Headers("Content-Type: application/json")
    @POST("patients/signup")
    fun signUp(
        @Body body: JsonObject
    ): Observable<SignUpResponse>

    @POST("refresh-token/patients")
    fun refreshLogin(
        @Header("Authorization") token: String,
        @Body body: HashMap<String, Any>
    ): Call<String>
}