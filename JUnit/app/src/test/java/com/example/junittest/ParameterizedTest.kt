package com.example.junittest

import org.junit.*
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParameterizedTest(var currentValue: Boolean, var currentUser: User) {

    @get:Rule
    val locationESRule = LocationESRule()



    companion object {

        var assertion: Assertion?= null

        @BeforeClass @JvmStatic
        fun setupCommon(){
            assertion = Assertion()
        }

        @AfterClass @JvmStatic
        fun tearDown(){
            assertion = null
        }


        @Parameterized.Parameters
        @JvmStatic
        fun getUSUsers() =
            arrayOf(false, User("Miguel Angel", 12),
                arrayOf(false, User("Miguel Angel", 12)),
                arrayOf(true, User("Roberto", 34)),
                arrayOf(true, User("Bot21", 4)),
                arrayOf(true, User("Lucas", 18)),
            )
    }

    @Test
    fun isAdultTest() {
        /*
        val assertion = Assertion()
        assertion.setLocatin("18")
        assertTrue(assertion.isAdult(user))

         */

        Assert.assertEquals(currentValue, locationESRule.assertion?.isAdult(currentUser))
    }
}