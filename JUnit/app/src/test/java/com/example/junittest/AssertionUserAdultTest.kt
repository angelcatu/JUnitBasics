package com.example.junittest

import org.junit.*
import org.junit.Assert.*

class AssertionUserAdultTest {


    private lateinit var bot: User
    private lateinit var user: User

    @get:Rule val locationESRule = LocationESRule()

    @Before
    fun setup(){
        bot = User("8bit", 1, false)
        user = User("Marielos", 18)
        println("Before")
    }

    @After
    fun tearDown(){
        bot = User()
        user = User("Marielos", 18)
        println("After")
    }

    @Test
    fun isAdultTest() {
        /*
        val assertion = Assertion()
        assertion.setLocatin("18")
        assertTrue(assertion.isAdult(user))

         */

        assertEquals(true, locationESRule.assertion?.isAdult(user))
    }
}