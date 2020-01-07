package com.example.kotlinexamples.ListPackage


fun main(){

    var bi= listOf(12,12,31,31,22)

    var str:String



    /*for(i in bi)
        println(i)*/
    var li : MutableList<String> = mutableListOf()

    li.add(0,"Kapil")
    li.add(1,"King")
    li.add(2,"Singh")
    li.add(3,"Bing")


    //println(li.get(2))
    for (i in li) print("$i ")
}