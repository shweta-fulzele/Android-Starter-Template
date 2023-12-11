package com.base.androidstartertemplate.domain.retrofit

import android.content.Context
import com.google.gson.Gson
import okhttp3.Interceptor
import okhttp3.Response
import okhttp3.ResponseBody.Companion.toResponseBody
import org.json.JSONObject
import java.lang.Exception

class MyAppInterceptor(context: Context) : Interceptor {

    private var context: Context

    init {
        this.context = context
    }

    override fun intercept(chain: Interceptor.Chain): Response {

        val request = chain.request()
        val response = chain.proceed(request)
        val rawJson = response.body?.string()

//        Try to get proper raw json
        try {
            val jsonObject = JSONObject(rawJson.toString())

        } catch (e: Exception) {
            e.printStackTrace()
        }


//        Get Refresh Token
        if (response.code == 401) {

//            get refresh token from api call
            val refreshToken = getRefreshToken(context)

            if (refreshToken != null) {
//                add the refresh token in the pref storage
            } else {
//                Hard code to get the refresh token
                val jsonObject = JSONObject()
                jsonObject.put("errorCode", 400)
                jsonObject.put("errorMessage", "Refresh Token Expired")
                return response.newBuilder().code(400).message("Refresh Token Expired")
                    .body(jsonObject.toString().toResponseBody(response.body?.contentType()))
                    .build()
            }

            val authorizationBuilder =
                request.newBuilder().addHeader("Authorization", " /* add token which we get */")
            return chain.proceed(authorizationBuilder.build())
        }

        return response

    }

    //    Return the response model as per login
    private fun getRefreshToken(context: Context): String {
        val refreshToken = ""
        val token = ""
        val body = HashMap<String, Any>()
        body["refreshToken"] = refreshToken
        val service = /*add retrofit api service */ ""
        val call = /*add refresh token api call*/ ""
        val response = /*call.execute()*/ 200
        val rawJson = /*response.body().toString()*/
            return if (response == 200) {
                ""
            } else {
                ""

            }
    }
}