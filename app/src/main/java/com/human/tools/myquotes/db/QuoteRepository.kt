package com.human.tools.myquotes.db

import com.human.tools.myquotes.domains.QuoteDomain
import io.reactivex.Completable

class QuoteRepository(
    private val quoteDao: QuoteDao,
    private val tagDao: TagDao
) {

    fun insert(quote: QuoteDomain): Completable {
        return Completable.fromCallable {
            val quoteId = quoteDao.Insert(Quote(id = 0, text = quote.text, timeStamp = quote.timeStamp))
            quote.tags.forEach {
                tagDao.insert(Tag(id = 0, quoteId = quoteId, tag = it))
            }
        }
    }

}