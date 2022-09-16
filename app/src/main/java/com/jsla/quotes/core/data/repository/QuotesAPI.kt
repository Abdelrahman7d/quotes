package com.jsla.quotes.core.data.repository

import com.jsla.quotes.core.data.Constants.BASE_URL
import com.jsla.quotes.ui.home.data.model.responseModels.Quote
import retrofit2.Call
import retrofit2.http.GET

interface QuotesAPI {

    @GET("quotes.php")
    fun getQuotes() : Call<List<Quote>>
}