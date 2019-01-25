package com.human.tools.myquotes.db

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query


@Dao
interface QuoteDao {

    @Insert
    fun Insert(quote: Quote): Long


    //    @Query("SELECT first_name, last_name FROM user WHERE region IN (:regions)")
//    fun loadUsersFromRegions(regions: List<String>): List<NameTuple>
    //https://developer.android.com/training/data-storage/room/accessing-data
    //https://guides.codepath.com/android/Room-Guide
    //https://medium.com/@marco_cattaneo/integrate-dagger-2-with-room-persistence-library-in-few-lines-abf48328eaeb
//    @Query(
//        "SELECT Quote.* FROM quotes_table INNER JOIN tag_table "
//                + "ON quote_table.id = tag_table.quoteId WHERE tag_table.tag IN (:tags)"
//    )
//    fun getQuotesWithTag(tags: List<String>): List<Quote>

}