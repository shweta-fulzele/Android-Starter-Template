package com.base.androidstartertemplate.domain.retrofit

import android.content.Context
import com.base.androidstartertemplate.data.api.ApiService
import com.base.androidstartertemplate.data.dataPref.AppInstance
import com.base.androidstartertemplate.data.dataPref.PreferenceManager
import com.base.androidstartertemplate.presentation.modules.login.data.model.LoginPatientsResponse
import com.base.androidstartertemplate.utility.Logger
import com.google.gson.Gson
import okhttp3.Headers
import okhttp3.Interceptor
import okhttp3.Response
import okhttp3.ResponseBody.Companion.toResponseBody
import okio.Buffer
import org.json.JSONObject
import java.io.EOFException
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets


/**
 * Created by Shweta Fulzele on 16 Jan 2024
 *
 */
class MyAppInterceptor(context: Context): Interceptor {
    private var context: Context
    init {
        this.context = context
    }
    companion object {
        /**
         * Provides the class name as TAG variable whenever required.
         *
         * Mostly used for Logging the data in LogCat.
         */
        private const val TAG = "TRSTInterceptor"
    }

    override fun intercept(chain: Interceptor.Chain): Response {
//        TODO("Not yet implemented")
        val request = chain.request()
        val response = chain.proceed(request)
        val rawJson = response.body?.string()

        Logger.info(TAG,"--->"+request.method+" "+request.url)
        Logger.info(TAG, Gson().toJson(request.headers))

        request.body?.let {
            if (bodyHasUnknownEncoding(request.headers)) {
                Logger.info(TAG,"--> END ${request.method} (encoded body omitted)")
            } else if (it.isDuplex()) {
                Logger.info(TAG,"--> END ${request.method} (duplex request body omitted)")
            } else if (it.isOneShot()) {
                Logger.info(TAG,"--> END ${request.method} (one-shot body omitted)")
            } else {
                val buffer = Buffer()
                it.writeTo(buffer)

                val contentType = it.contentType()
                val charset: Charset = contentType?.charset(StandardCharsets.UTF_8) ?: StandardCharsets.UTF_8

                Logger.info(TAG,"")
                if (buffer.isProbablyUtf8()) {
                    Logger.info(TAG,buffer.readString(charset))
                    Logger.info(TAG,"--> END ${request.method} (${it.contentLength()}-byte body)")
                } else {
                    Logger.info(
                        TAG,
                        "--> END ${request.method} (binary ${it.contentLength()}-byte body omitted)")
                }
            }
        }
//        request.body?.let { Logger.info(TAG, JSONObject(RequestBody.toString().toRequestBody(it.contentType())).toString(4)) }

        Logger.info(TAG,"<---"+response.code+" "+request.url)
//        Logger.info(TAG, response.message)

//        to get the json response properly
        try {
            Logger.info("RawJson", rawJson.toString() )
            val jsonResponse = JSONObject(rawJson.toString())
            Logger.info(TAG, jsonResponse.toString(4))
        } catch (e: Exception) {
            e.printStackTrace()
        }

//        Refresh Token logic
        if (response.code == 401) {
            val refreshToken = getRefreshToken(context)
            if (refreshToken != null) {
                refreshToken.data?.let {
                    PreferenceManager.storeLoginInfo(context = context,
                        value = it
                    )
                }
            } else {
//                Hard Code
                val jsonObject = JSONObject()
                jsonObject.put("errorCode",400)
                jsonObject.put("errorMessage", "Refresh Token Expired")
                return response.newBuilder().code(400).message("Refresh Token Expired").body(jsonObject.toString().toResponseBody(response.body?.contentType())).build()
            }

            val authorizationBuilder = request.newBuilder()
                .header("Authorization", AppInstance.getLogin(context)?.getToken()?:"")
            return chain.proceed(authorizationBuilder.build())
        }
//        Can be only written response without modifying it
        return response.newBuilder().body(rawJson?.toResponseBody(response.body?.contentType())).build()
    }

    //    Extra code
    internal fun Buffer.isProbablyUtf8(): Boolean {
        try {
            val prefix = Buffer()
            val byteCount = size.coerceAtMost(64)
            copyTo(prefix, 0, byteCount)
            for (i in 0 until 16) {
                if (prefix.exhausted()) {
                    break
                }
                val codePoint = prefix.readUtf8CodePoint()
                if (Character.isISOControl(codePoint) && !Character.isWhitespace(codePoint)) {
                    return false
                }
            }
            return true
        } catch (_: EOFException) {
            return false // Truncated UTF-8 sequence.
        }
    }

    //    Extra code

    private fun bodyHasUnknownEncoding(headers: Headers): Boolean {
        val contentEncoding = headers["Content-Encoding"] ?: return false
        return !contentEncoding.equals("identity", ignoreCase = true) &&
                !contentEncoding.equals("gzip", ignoreCase = true)
    }

    private fun getRefreshToken(context: Context): LoginPatientsResponse? {
//        TODO("Not yet implemented")
        val refreshToken = AppInstance.getLogin(context)?.refresh_token?:""
        val token = AppInstance.getLogin(context)?.getToken()?:""
        val body = HashMap<String, Any>()
        body["refreshToken"] = refreshToken
        val service = RetrofitClient.getRetrofitClient(ApiUtils.BASE_URL,context).create(ApiService::class.java)
        val call = service.refreshLogin(token, body)
        val response = call.execute()
        val rawJson = response.body().toString()
        return if (response.code() == 200) {
            Gson().fromJson(rawJson, LoginPatientsResponse::class.java)
        } else {
            null
        }
    }
}