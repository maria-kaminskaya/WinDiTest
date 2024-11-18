package com.kmnvxh.winditest.di

import android.content.Context
import com.kmnvxh.winditest.presentation.MainActivity
import com.kmnvxh.winditest.presentation.application.ApplicationLoader
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class
    ]
)
interface AppComponent {
    fun inject(loader: ApplicationLoader)
    fun inject(activity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }
}