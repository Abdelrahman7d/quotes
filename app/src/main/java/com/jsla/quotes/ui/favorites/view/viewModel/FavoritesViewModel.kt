package com.jsla.quotes.ui.favorites.view.viewModel

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jsla.quotes.core.data.repository.QuotesAPI
import com.jsla.quotes.core.data.repository.QuotesApiImpl
import com.jsla.quotes.ui.home.data.model.responseModels.Quote
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject
import kotlin.coroutines.coroutineContext

class FavoritesViewModel: ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Favorites Fragment"
    }
    val text: LiveData<String> = _text
}