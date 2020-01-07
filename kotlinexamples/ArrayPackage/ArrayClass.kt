package com.example.kotlinexamples.ArrayPackage

import com.example.kotlinexamples.SamplePrograms.Task.StatusClass

fun main(){

    var arr= intArrayOf(1,2,3,4)

    var brr= IntArray(4)

    var sArray= arrayOfNulls<StatusClass>(5)
    var ran= 0 until sArray.size

    var rum: String= ""


    var chosenEldersId= IntArray(4)

    for(i in sArray)
        println(i)

    /*for(i in ran)
        sArray.set(i,"hello $i")


    for((i,j)in arr.withIndex())
        brr.set(i,j+10)


    println("elements from arr")
    for(i in arr)
        println(i)

    println("elements from brr")
    for(i in brr)
        println(i)

    println("elements from sArray")
    for(i in sArray)
        println(i)*/
}