package com.example.junittest

class Assertion {

    private var user = User("Angel", 27)

    fun getLockyNumbers(): Array<Int>{
        return arrayOf(21, 117)
    }

    fun getName(): String {
        return this.user.name
    }

    fun checkHuman(user: User? = null): Boolean?{
        if(user == null) return null
        return user.isHuman
    }

    fun isAdult(user: User): Boolean{
        if(!user.isHuman!!) return true
        else return user.age >= 18
    }
}