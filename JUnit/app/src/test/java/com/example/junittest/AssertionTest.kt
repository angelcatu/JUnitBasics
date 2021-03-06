package com.example.junittest

import org.junit.Assert.*
import org.junit.Test
import kotlin.random.Random

class AssertionTest{
    @Test
    fun getArrayTest(){
        val assertion = Assertion()
        val array = arrayOf(21, 117)
        assertArrayEquals(array, assertion.getLockyNumbers())
        assertArrayEquals("mensaje de error en testing", array, assertion.getLockyNumbers())
    }

    @Test
    fun getNameTest(){
        val assertion = Assertion()
        val name = "Angel"
        val otherName = "Jimena"

        assertEquals(name, assertion.getName())
    }

    @Test
    fun checkHumanTest(){
        val assertion = Assertion();
        val bot = User("8bit", 1, false)
        val human1 = User("Marielos", 18)

        //assertion.checkHuman(human1)?.let { assertFalse(it) }

        assertion.checkHuman(human1)?.let { assertTrue(it) }
    }

    @Test
    fun checkNullUserTest(){
        val user = null
        assertNull(user)

        val assertion = Assertion()
        assertNull(assertion.checkHuman(user))
    }

    @Test(timeout = 1000)
    fun getCitiesTest(){
        var cities = arrayOf("México", "Letonia", "Colombia")
        Thread.sleep(Random.nextLong(900, 1050))
        assertEquals(3, cities.size)
    }
}