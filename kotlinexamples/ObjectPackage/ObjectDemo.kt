package com.example.kotlinexamples.ObjectPackage

fun main(){ // main function params not required from kotlin 1.3

    callObjectClass.book.add(ObjectClass("Java",200))
    callObjectClass.book.add(ObjectClass("Kotlin",500))
    callObjectClass.book.add(ObjectClass("Flutter", 600))

    callObjectClass.showBooks()

}