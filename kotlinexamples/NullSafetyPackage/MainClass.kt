package com.example.kotlinexamples.NullSafetyPackage

fun main(){

    var name: String?="kapil"

    // ?. executes the length only if NOT NULL

    println("The length of name is ${name?.length}")


    // ?.let

    name?.let {
        println("The length of name is ${it.length}")
    }


    // ?:

    println("The length of name is ${name?.length?:-1}")

    // !!.

    println("The length of name is ${name!!.length}")
}