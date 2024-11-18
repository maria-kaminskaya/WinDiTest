package com.kmnvxh.winditest.data.service

import java.util.concurrent.TimeUnit
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.reflect.KClass

class RetrofitServiceGenerator {

    fun <T : Any> service(serviceClass: KClass<T>): T =
        synchronized(this) { service(serviceClass, createOkHttpClient()) }

    private fun <T : Any> service(serviceClass: KClass<T>, okHttpClient: OkHttpClient, url: String = BASE_URL): T =
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .baseUrl(url)
            .build()
            .create(serviceClass.java)

    private fun createOkHttpClient() =
        OkHttpClient.Builder()
            .apply {
                networkInterceptors().add(Interceptor { chain ->
                    val requestBuilder = chain.request().newBuilder()
                    chain.proceed(requestBuilder.build())
                })
            }
            .build()
            .newBuilder()
            .connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)
            .writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(TIMEOUT, TimeUnit.SECONDS)
            .build()

    companion object {

        private const val BASE_URL = "https://plannerok.ru/doc%20#/"
        private const val CONNECT_TIMEOUT = 60L
        private const val WRITE_TIMEOUT = 90L
        private const val TIMEOUT = 120L
    }
}