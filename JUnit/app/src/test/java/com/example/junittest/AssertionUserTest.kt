package com.example.junittest

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
    }

    @Test
    fun checkHuman() {
        val assertion = Assertion();
        //assertion.checkHuman(human1)?.let { assertFalse(it) }
        assertion.checkHuman(human1)?.let { assertTrue(it) }
    }

    @Test
    fun checkNotNullUserTest(){
        val assertion = Assertion()
        assertNotNull(human1)
    }
}