package com.human.tools.myquotes.di

import android.app.Application
import android.arch.persistence.room.Room
import com.human.tools.myquotes.db.QuoteDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class RoomModule {
    // var quoteDatabase: QuoteDatabase

//    constructor(application: Application) {
//        quoteDatabase = Room.databaseBuilder(application, QuoteDatabase::class.java, "quote-db").build()
//    }

    @Singleton
    @Provides
    fun providesDataBase(application: Application): QuoteDatabase {
        return Room.databaseBuilder(application, QuoteDatabase::class.java, "quote-db").build()
    }

    @Singleton
    @Provides
    fun providesQuoteDao(quoteDatabase: QuoteDatabase) = quoteDatabase.quoteDao()

    @Singleton
    @Provides
    fun providesTagDao(quoteDatabase: QuoteDatabase) = quoteDatabase.tagDao()

}