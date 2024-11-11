package com.dicoding.mysimplelogin.di.module

import com.dicoding.mysimplelogin.SessionManager
import com.dicoding.mysimplelogin.UserRepository
import org.koin.dsl.module

val storageModule = module {
    factory {
        SessionManager(get())
    }

    factory {
        UserRepository(get())
    }
}