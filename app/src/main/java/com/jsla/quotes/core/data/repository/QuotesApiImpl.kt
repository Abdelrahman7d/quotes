package com.jsla.quotes.core.data.repository

import android.util.Log
import com.jsla.quotes.ui.home.data.model.responseModels.Quote
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class QuotesApiImpl @Inject constructor(
    val quotesAPI: QuotesAPI
) : QuotesAPI {

    override fun getQuotes(): Call<List<Quote>> {

        val call = quotesAPI.getQuotes()

        call.enqueue(object : Callback<List<Quote>> {
            override fun onResponse(call: Call<List<Quote>>, response: Response<List<Quote>>) {

                val quotes = response.body()!!
                val iterator = quotes?.iterator()

                if (iterator != null) {
                    for(quote in iterator){
                        Log.d("Tracer",quote.quote)
                    }
                }
            }

            override fun onFailure(call: Call<List<Quote>>, t: Throwable) {
                Log.d("Tracer",t.message.toString())
            }
        })

        return call
    }

}