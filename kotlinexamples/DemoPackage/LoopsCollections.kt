package com.example.kotlinexamples.DemoPackage

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

fun main(args: Array<String>) {

    /*var ch: Char = 'd'

    var num = 'x'.downTo('b')

    var num1=10 downTo 2

    for (a in num1 step 2) {
        println(a)
    }

    var i=0

    var nums= listOf(2,3,4,5,6)

    nums+= listOf(7,8,9,10)

    for ((b,e) in nums.withIndex())
        println("$b:$e")
*/



    /*while (i<=10){
        println(i);
        i++;
    }*/


   /* do{
        print(i)
        i++

    }while (i!=5)*/


    // MAPS

    var nameSal= TreeMap<String,Int>()

    var nameSal1= HashMap<String,Int>()

    var bp= ArrayList<Int>(4)

   bp.add(21)
    bp.add(22)
    bp.add(23)



    for ((i,e) in bp.withIndex())
        println("$i:$e")



    nameSal["Kapil"]=12000
    nameSal["popoye"]=10191
    nameSal["RAMA"]=2323

    println(nameSal.get("RAMA"))


    //Treemap
    for ((name,sal) in nameSal)
        println("$name:$sal")

    //Hashmap
    for ((name,sal) in nameSal1)
        println("$name:$sal")


}