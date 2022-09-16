package com.jsla.quotes.ui.myQuotes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyQuotesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is my quotes Fragment"
    }
    val text: LiveData<String> = _text
}