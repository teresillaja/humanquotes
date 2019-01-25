package com.human.tools.myquotes.di

import com.human.tools.myquotes.home.MainActivity
import com.human.tools.myquotes.home.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    abstract fun contributeActivityAndroidInjector(): MainActivity

}

