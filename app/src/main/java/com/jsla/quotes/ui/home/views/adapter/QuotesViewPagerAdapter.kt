package com.jsla.quotes.ui.home.views.adapter

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import com.jsla.quotes.R
import com.jsla.quotes.core.view.MyBlurBuilder
import com.jsla.quotes.ui.home.data.model.responseModels.Quote

class QuotesViewPagerAdapter : PagerAdapter() {

    lateinit var quotes : List<Quote>

    override fun getCount(): Int {
        return quotes.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view ==  `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val quoteObject : QuoteObject = QuoteObject(container.context)
        quoteObject.bind(quotes[position])

        return quoteObject
    }

}

class QuoteObject(context: Context) : ViewGroup(context) {

    val quoteTV : TextView = TextView(context)
    val imageView : ImageView = ImageView(context)

    fun bind(quote: Quote){

        quoteTV.text = quote.quote
        imageView.setImageBitmap(createBluerImage())
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {

    }

    fun createBluerImage() : Bitmap? {

        val srcBitmap = BitmapFactory.decodeResource(resources, R.mipmap.feather)

        val blurredBitmap = MyBlurBuilder.applyBlur(context, srcBitmap, 5f)

        return blurredBitmap
    }
}