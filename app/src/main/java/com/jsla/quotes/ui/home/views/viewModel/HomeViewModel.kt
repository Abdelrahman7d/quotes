package com.jsla.quotes.ui.home.views.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jsla.quotes.core.data.repository.QuotesAPI
import com.jsla.quotes.ui.home.data.model.responseModels.Quote
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class HomeViewModel@Inject constructor(
    val quotesAPI: QuotesAPI
) : ViewModel() {

    val quotesMutData by lazy { MutableLiveData<List<Quote>>()}

    init {

        getQuotes()
    }

    private fun getQuotes() {

        val call = quotesAPI.getQuotes()

        call.enqueue(object : Callback<List<Quote>> {
            override fun onResponse(call: Call<List<Quote>>, response: Response<List<Quote>>) {

                val quotes = response.body()!!
                val iterator = quotes.iterator()
                for(quote in iterator){
                    Log.d("Tracer",quote.quote)
                }
                quotesMutData.postValue(quotes)
            }

            override fun onFailure(call: Call<List<Quote>>, t: Throwable) {
                Log.e("Tracer",t.message.toString())
            }
        })

    }

    private val _text = MutableLiveData<String>().apply {
        value = "الرئيسية"
    }
    val text: LiveData<String> = _text
}