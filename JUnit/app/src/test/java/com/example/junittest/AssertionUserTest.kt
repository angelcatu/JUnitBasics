package com.example.junittest

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class AssertionUserTest {

    private lateinit var bot: User
    private lateinit var human1: User

    @Before
    fun setup(){
        bot = User("8bit", 1, false)
        human1 = User("Marielos", 18)
        println("Before")
    }

    @After
    fun tearDown(){
        bot = User()
        human1 = User()
        println("After")
    }

    @Test
    fun checkHuman() {
        val assertion = Assertion();
        //assertion.checkHuman(human1)?.let { assertFalse(it) }
        assertion.checkHuman(human1)?.let { assertTrue(it) }

        println("CheckHuman")
    }

    @Test
    fun checkNotNullUserTest(){
        assertNotNull(human1)

        println("CheckNotNullUser")
    }
}