package com.jogger.http.interceptor

import com.jogger.utils.MConfig
import okhttp3.Interceptor
import okhttp3.Response

/**
 * Created by jogger on 2020/2/26
 * 描述：
 */
class HeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val newBuilder = request.newBuilder()
        newBuilder.addHeader("Cookie", MConfig.getCookie());
        return chain.proceed(newBuilder.build())
    }
}