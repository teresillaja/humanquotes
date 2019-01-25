package com.human.tools.myquotes

import android.app.Activity
import android.app.Application
import com.human.tools.myquotes.di.AppModule
import com.human.tools.myquotes.di.DaggerAppComponent
import com.human.tools.myquotes.di.RoomModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class QuotesApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder()
            .applicationBind(this)
            .bindAppModule(AppModule())
            .bindRoomModule(RoomModule())
            .build()
            .inject(this)

    }

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector

}