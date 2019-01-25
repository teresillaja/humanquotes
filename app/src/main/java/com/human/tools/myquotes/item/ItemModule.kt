package com.human.tools.myquotes.item

import dagger.Binds
import dagger.Module

@Module
interface ItemModule {

    @Binds
    fun bindPresenter(impl: ItemPresenter): ItemContract.Presenter

    @Binds
    fun bindView(impl: ItemView): ItemContract.View

}