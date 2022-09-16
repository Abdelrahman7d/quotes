package com.jsla.quotes.core.data

import com.jsla.quotes.core.data.Constants.BASE_URL
import com.jsla.quotes.core.data.repository.QuotesAPI
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitFactory {

    fun createQuotesApi() : QuotesAPI = getRetrofitBuilder().create(QuotesAPI::class.java)

    private fun getRetrofitBuilder():Retrofit =
        Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
}