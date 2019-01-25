package com.human.tools.myquotes.home

import dagger.Binds
import dagger.Module

@Module
abstract class MainActivityModule {

    @Binds
    abstract fun bindsActivityView(activity: MainActivity): MainActivityContract.View

    @Binds
    abstract fun bindsActivityPresenter(presenter: MainActivityPresenter): MainActivityContract.Presenter
}