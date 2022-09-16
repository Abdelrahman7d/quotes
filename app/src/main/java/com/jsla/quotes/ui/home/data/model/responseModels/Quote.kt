package com.jsla.quotes.ui.home.data.model.responseModels

import com.google.gson.annotations.SerializedName

data class Quote(
    @SerializedName("id")
    val id:Int,

    @SerializedName("quote")
    val quote:String,
)