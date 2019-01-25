package com.human.tools.myquotes.item

import javax.inject.Inject

class ItemPresenter @Inject
constructor(private val view: ItemContract.View) : ItemContract.Presenter {

    override fun bindData(quote: ItemModel) {
        view.setText(quote.quote)
    }
}