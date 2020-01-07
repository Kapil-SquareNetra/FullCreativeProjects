package com.example.kotlinexamples.CollectionsPackage

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(){

    var mp= mapOf<Int,String>(1 to "one", 2 to "two", 3 to "three")

    println("immutable map")
    for (i in mp.keys)
        println("$i: ${mp.get(i)}")


    var hmp= hashMapOf<Int, Int>()
    hmp.put(1,200)
    hmp.put(2,400)
    hmp.put(3,600)
    hmp.put(4,800)

    hmp.replace(3,600,1000)

    println("hashmap map")
    for (i in hmp.keys)
        println("$i: ${hmp.get(i)}")
}