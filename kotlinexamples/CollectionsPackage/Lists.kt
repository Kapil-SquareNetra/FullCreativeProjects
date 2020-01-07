package com.example.kotlinexamples.CollectionsPackage

import java.util.*
import kotlin.collections.ArrayList

fun main(){

// list
    var list= listOf<Any>("Hello",21,100.21)

    var li: MutableList<Any> = mutableListOf(1001,21.22)


    li.add("String")
    li.add(2.11)

    li.removeAt(0)
    li.add(21)


    var ali: ArrayList<Int> = arrayListOf(11,44,111,222,33)
    ali.add(21)
    ali.add(22)
    ali.add(23)
    //ali.reverse()




    println("immutable list")
    for(i in li)
        println(i)


    println("mutable list")
    for(i in list)
        println(i)

    println("Array list")
    for(i in ali)
        println(i)




}