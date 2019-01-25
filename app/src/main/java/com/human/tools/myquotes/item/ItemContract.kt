package com.human.tools.myquotes.item

interface ItemContract {
    interface Presenter {
        fun bindData(quote: ItemModel)
    }

    interface View {
        fun setText(text: String)
    }
}