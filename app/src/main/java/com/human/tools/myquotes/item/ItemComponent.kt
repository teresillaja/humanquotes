package com.human.tools.myquotes.item

import android.view.View
import dagger.BindsInstance
import dagger.Component


@Component(modules = [ItemModule::class])
abstract class ItemComponent {

    abstract fun getPresenter(): ItemContract.Presenter

    @Component.Builder
    internal interface Builder {
        @BindsInstance
        fun setView(itemView: View): Builder

        fun build(): ItemComponent
    }
}