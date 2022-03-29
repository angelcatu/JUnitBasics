package com.example.junittest

class Assertion {

    private var user = User("Angel", 27)
    private var location = "USA"

    fun setLocatin(location: String){
        this.location = location
    }

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

        return if(location == "USA") user.age >= 21
        else return user.age >= 18
    }
}