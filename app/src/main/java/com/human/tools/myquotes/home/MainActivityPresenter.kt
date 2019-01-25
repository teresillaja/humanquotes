package com.human.tools.myquotes.home

import com.human.tools.myquotes.db.QuoteRepository
import com.human.tools.myquotes.item.ItemModel
import javax.inject.Inject

class MainActivityPresenter @Inject constructor(
    private val quoteRepository: QuoteRepository,
    private val view: MainActivityContract.View
) : MainActivityContract.Presenter {
    override fun init() {
        val data = listOf(
            ItemModel("hello", "world"),
            ItemModel("adios", "world"),
            ItemModel("hello", "world"),
            ItemModel("hello", "world"),
            ItemModel("adios", "world"),
            ItemModel("hello", "world"),
            ItemModel("hello", "world"),
            ItemModel("adios", "world"),
            ItemModel("hello", "world"),
            ItemModel("hello", "world"),
            ItemModel("adios", "world"),
            ItemModel("hello", "world"),
            ItemModel("hello", "world"),
            ItemModel("adios", "world"),
            ItemModel("hello", "world"),
            ItemModel("hello", "world"),
            ItemModel("adios", "world"),
            ItemModel("hello", "world"),
            ItemModel("hello", "world"),
            ItemModel("adios", "world"),
            ItemModel("hello", "world"),
            ItemModel("hello", "world"),
            ItemModel("adios", "world"),
            ItemModel("hello", "world"),
            ItemModel("hello", "world"),
            ItemModel("adios", "world"),
            ItemModel("hello", "world"),
            ItemModel("hello", "world"),
            ItemModel("adios", "world"),
            ItemModel("hello", "world"),
            ItemModel("hello", "world"),
            ItemModel("adios", "world"),
            ItemModel("hello", "world"),
            ItemModel("hello", "world"),
            ItemModel("adios", "world"),
            ItemModel("hello", "world"),
            ItemModel("hello", "world"),
            ItemModel("adios", "world"),
            ItemModel("hello", "world"),
            ItemModel("hello", "world"),
            ItemModel("adios", "world"),
            ItemModel("hello", "world"),
            ItemModel("hello", "world"),
            ItemModel("adios", "world"),
            ItemModel("hello", "world")
        )
        view.setData(data)
    }

}