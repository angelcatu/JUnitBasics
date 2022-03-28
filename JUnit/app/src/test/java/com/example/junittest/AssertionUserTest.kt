package com.example.junittest

import org.junit.*
import org.junit.Assert.*

class AssertionUserTest {

    private lateinit var bot: User

    companion object{
        private lateinit var user: User

        @BeforeClass @JvmStatic
        fun setupCommon(){
            user = User("Marielos", 18)
            println("BeforeClass")
        }

        @AfterClass @JvmStatic
        fun tearDownCommon(){
            user = User()
            println("AfterClass")
        }
    }

    @Before
    fun setup(){
        bot = User("8bit", 1, false)
        println("Before")
    }

    @After
    fun tearDown(){
        bot = User()
        println("After")
    }

    @Test
    fun checkHuman() {
        val assertion = Assertion();
        //assertion.checkHuman(human1)?.let { assertFalse(it) }
        assertion.checkHuman(user)?.let { assertTrue(it) }

        println("CheckHuman")
    }

    @Test
    fun checkNotNullUserTest(){
        assertNotNull(user)

        println("CheckNotNullUser")
    }


    @Test
    fun checkNotSameUserTest(){
        assertNotSame(bot, user)
    }


    @Test
    fun checkSameUserTest(){
        val humanCopy = user
        assertSame(humanCopy, user)
    }
}