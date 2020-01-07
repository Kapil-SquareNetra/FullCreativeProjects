package com.example.kotlinexamples.DemoPackage

fun main(args: Array<String>){
    println("Hello Gajodhar Bhaiya")

    var newVariable= VarDemoClass()
    newVariable.name="Kapil"

    println("My Name is " + newVariable.name) //printing similar to java using concatenation
    println("My Age is ${newVariable.age}")     // printing in kotlin using ${variable_name}

    newVariable= VarDemoClass();
    println("My Name is " + newVariable.name) //printing similar to java using concatenation
    println("My Age is ${newVariable.age}")

    var jav= JavaDemoClass()
    jav.salary =2500000

    println("${jav.salary}")
}
