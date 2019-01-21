package com.human.tools.myquotes.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = arrayOf(Quote::class, Tag::class), version = 1)
abstract class QuoteDatabase : RoomDatabase() {
    abstract fun quoteDao(): QuoteDao
}