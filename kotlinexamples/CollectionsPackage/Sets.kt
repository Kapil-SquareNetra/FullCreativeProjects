package com.example.kotlinexamples.CollectionsPackage

fun main(){

    var st= setOf<Int>(1,2,2,2,2,3,4,4,5)

    var mst= mutableSetOf<Int>(1,2,2,2,2,3,4,4,5)
    mst.remove(4)

    var hst= hashSetOf<Int>(7,2,1,4,2,3,1,2,2,2,2,3,4,4,5)

   // hst.add(23)


    println("immutable set")
    for (i in st)
        println(i)

    println("mutable set")
    for (i in mst)
        println(i)

    println("hash set")
    for (i in hst)
        println(i)
}