package com.base.androidstartertemplate.domain.manager

import android.database.Observable
import android.net.ParseException
import android.util.Log
import com.base.androidstartertemplate.domain.responseListener.ResponseListener
import com.google.gson.Gson
import com.google.gson.stream.MalformedJsonException
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import org.json.JSONObject
import retrofit2.HttpException
import java.lang.Exception
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import java.util.concurrent.TimeoutException
import javax.security.auth.callback.Callback

class NetworkManager {

    private var compositeDisposable : Disposable? = null
    private val tag: String = NetworkManager::class.java.simpleName

//    Generic RxJava function for api calling

    fun <V : Any> createAPIRequest(observables: io.reactivex.Observable<V>, callback: ResponseListener<V>){
        callback.onLoading(true)
        compositeDisposable = observables
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableObserver<V>(){
                override fun onNext(t: V) {
                    callback.onResponseReceived(t, 0)
                    callback.onLoading(false)
                }

                override fun onError(e: Throwable) {
                    callback.onErrorReceived(setUpErrors(e), 0)
                    callback.onLoading(false)
                }

                override fun onComplete() {
                    callback.onLoading(false)
                }

            })
    }

// Function to return error received in a proper format
//    TO log errors and display on ui dialogs

    private fun setUpErrors(t: Throwable): ErrorModel{
        val errorModel = ErrorModel()
        try {
            when (t) {
                is SocketTimeoutException -> {
                    errorModel.errorCode = ResponseCodes.INTERNET_NOT_AVAILABLE
                    errorModel.message = ResponseCodes.logErrorMessage(errorModel.errorCode)
                }
                is TimeoutException -> {
                    errorModel.errorCode = ResponseCodes.URL_CONNECTION_ERROR
                    errorModel.message = ResponseCodes.logErrorMessage(errorModel.errorCode)
                }
                is ClassCastException -> {
                    errorModel.errorCode = ResponseCodes.MODEL_TYPE_CAST_EXCEPTION
                    errorModel.message = ResponseCodes.logErrorMessage(errorModel.errorCode)
                }
                is MalformedJsonException -> {
                    errorModel.errorCode = ResponseCodes.MODEL_TYPE_CAST_EXCEPTION
                    errorModel.message = ResponseCodes.logErrorMessage(errorModel.errorCode)
                }
                is ParseException -> {
                    errorModel.errorCode = ResponseCodes.MODEL_TYPE_CAST_EXCEPTION
                    errorModel.message = ResponseCodes.logErrorMessage(errorModel.errorCode)
                }
                is UnknownHostException -> {
                    errorModel.errorCode = ResponseCodes.INTERNET_NOT_AVAILABLE
                    errorModel.message = ResponseCodes.logErrorMessage(errorModel.errorCode)
                }
                else -> {
                    Log.e("errorMessage", Gson().toJson(t))
                    val errorMessage = (t as HttpException).response()?.errorBody()!!.string()
                    val responseCode = t.response()?.code()
                    if (responseCode != null) {
                        errorModel.errorCode = responseCode
                    }
                    val errorObject = JSONObject(errorMessage)
                    val error = ErrorMessageJson(errorObject.getString("timestamp"),
                        errorObject.getString("status"),
                        if( errorObject.has("statusCode")) errorObject.getInt("statusCode") else errorObject.getInt("status"),
                        if(errorObject.has("message")) errorObject.getString("message") else errorObject.getString("error"),
                    )
                    errorModel.errorMessage = error
                }
            }
        }catch (e : Exception){
            e.printStackTrace()
            errorModel.errorCode = ResponseCodes.UNKNOWN_ERROR
            errorModel.message = ResponseCodes.logErrorMessage(errorModel.errorCode)
        }

        return errorModel
    }
}