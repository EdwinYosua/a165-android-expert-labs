package com.dicoding.mysimplelogin

import android.app.Application
import com.dicoding.mysimplelogin.di.module.storageModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(storageModule)
        }
    }
}