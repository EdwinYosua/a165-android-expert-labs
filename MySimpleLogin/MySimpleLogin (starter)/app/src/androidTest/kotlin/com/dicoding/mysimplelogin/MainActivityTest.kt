package com.dicoding.mysimplelogin

import com.dicoding.mysimplelogin.di.module.storageModule
import org.junit.After
import org.junit.Before
import org.koin.core.context.loadKoinModules
import org.koin.core.context.stopKoin
import org.koin.test.KoinTest
import org.koin.test.inject
import kotlin.test.Test
import kotlin.test.assertEquals

class MainActivityTest : KoinTest {
    private val userRepository: UserRepository by inject()
    private val username = "Edwin"

    @Before
    fun before() {
        loadKoinModules(storageModule)
        userRepository.loginUser(username)
    }

    @After
    fun after() {
        stopKoin()
    }

    @Test
    fun getUsernameFromRepository() {
        val requestedName = userRepository.getUser()
        assertEquals(username, requestedName)
    }
}