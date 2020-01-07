package com.example.kotlinexamples.DataClassPackage

fun main(Args: Array<String>){

    var d1= DataClass("Dell",45000.50)
    println(d1)

    var d2= DataClass("Dell",45000.50)
    println(d2)

    println(d1==d2)
    println(d1.equals(d2))

    var d3=d2.copy(brandName = "Apple")
    println(d3)

    d3.show()

}