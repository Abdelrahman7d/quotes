package com.jsla.quotes.core.di

import com.jsla.quotes.core.data.repository.QuotesAPI
import com.jsla.quotes.core.data.repository.QuotesApiImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//@InstallIn(SingletonComponent::class)
//@Module
abstract class QuotesApiImplModule {

//    @Binds
//    @Singleton
//    abstract fun provideQuotesAPIImplModule(quotesApiImpl: QuotesApiImpl): QuotesAPI
}