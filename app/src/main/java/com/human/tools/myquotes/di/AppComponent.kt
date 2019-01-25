package com.human.tools.myquotes.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule


@Component(modules = [AppModule::class, RoomModule::class, AndroidInjectionModule::class, ActivitiesModule::class])
interface AppComponent {

    fun inject(application: Application)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun applicationBind(application: Application): Builder

        @BindsInstance
        fun bindRoomModule(roomModule: RoomModule): Builder

        @BindsInstance
        fun bindAppModule(appModule: AppModule): Builder

        fun build(): AppComponent

//        @BindsInstance
//        fun applicationBind(application: Application): Builder

    }
}