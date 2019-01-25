package com.human.tools.myquotes.home

import com.human.tools.myquotes.item.ItemModel

interface MainActivityContract {

    interface Presenter {
        fun init()
    }

    interface View {
        fun setData(data: List<ItemModel>)
    }
}