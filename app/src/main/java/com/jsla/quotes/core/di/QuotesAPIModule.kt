package com.jsla.quotes.core.di

import com.jsla.quotes.core.data.repository.QuotesAPI
import com.jsla.quotes.core.data.RetrofitFactory
import com.jsla.quotes.core.data.repository.QuotesApiImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module

object QuotesAPIModule {

    @Provides
    @Singleton
    fun provideQuotesAPIModule(): QuotesAPI = RetrofitFactory.createQuotesApi()

}