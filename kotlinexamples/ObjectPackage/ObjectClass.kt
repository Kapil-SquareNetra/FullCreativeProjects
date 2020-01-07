package com.example.kotlinexamples.ObjectPackage

data class ObjectClass(var bookName:String, var bookCost: Int)

object callObjectClass{

    var book= arrayListOf<ObjectClass>()

    fun showBooks(){
        for (i in book)
            println(i)
    }
}
