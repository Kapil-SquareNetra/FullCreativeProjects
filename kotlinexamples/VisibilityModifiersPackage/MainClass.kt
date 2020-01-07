package com.example.kotlinexamples.VisibilityModifiersPackage

object SubClass : ParentClass(){
    fun run(){


        println("public access " +w)
       // println(sc.x)  private access
        println("Protected access " +y)
        println("Internal access " +z)
    }
}

fun main(){

    var oc=OtherClass()

    //println(oc.a)  //private access
    //println(oc.b)   //protected access
    println("Internal access " +oc.c)
    println("public access " +oc.d)

    var sc= SubClass
    sc.run()

}