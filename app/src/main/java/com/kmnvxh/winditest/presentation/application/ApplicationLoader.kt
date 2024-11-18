package com.kmnvxh.winditest.presentation.application

import android.app.Application
import com.kmnvxh.winditest.di.AppComponent
import com.kmnvxh.winditest.di.DaggerAppComponent

class ApplicationLoader : Application() {

    private val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }

    override fun onCreate() {
        super.onCreate()

        appComponent.inject(this)
    }
}