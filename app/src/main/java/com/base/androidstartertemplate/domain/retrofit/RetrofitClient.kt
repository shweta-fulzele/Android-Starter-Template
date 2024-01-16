package com.base.androidstartertemplate.domain.retrofit

import android.content.Context
import com.base.androidstartertemplate.BuildConfig
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.Url
import java.util.concurrent.TimeUnit

abstract class RetrofitClient {

    companion object {
        lateinit var retrofit: Retrofit

        fun getRetrofitClient(baseUrl: String, context: Context): Retrofit {
            val okHttpClient = getOkHttp(context)

            return Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()
        }

        private fun getOkHttp(context: Context): OkHttpClient {
            val loggingInterceptor = MyAppInterceptor(context)

            return OkHttpClient.Builder()
                .callTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .addInterceptor(requestInterceptor) /*Pass header through interceptor*/
                .addInterceptor(loggingInterceptor) /*Log the response and get refresh token */
                .build()
        }

            private val requestInterceptor = Interceptor { chain ->
                val url = chain.request()
                    .url
                    .newBuilder()
                    .addQueryParameter("api_key", "") /*Can add header through interceptors or bearer toekn*/
                    .build()

                val request = chain.request()
                    .newBuilder()
                    .url(url)
                    .build()
                return@Interceptor chain.proceed(request)
            }


    }

}