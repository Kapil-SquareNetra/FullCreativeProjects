@file:JvmName("Red")

package com.example.kotlinexamples.DemoPackage

@JvmOverloads
fun add(a: Int, b:Int, c:Int=10):Int=a+b+c

fun max(a:Int, b:Int): Int= if(a>b) a else b

var num= add(1,2,3)