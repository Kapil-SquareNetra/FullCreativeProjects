package com.example.kotlinexamples.FilterMapPackage

fun main(){


    var list: List<Int> = listOf<Int>(1,2,7,5,100,12,45,78,34,200,222)
    var oneDigit: List<Int> =list.filter { i->i<10 }
    var twoDigit: List<Int> =list.filter { it in 10..99}
    var oneDigitSquared= list.filter { it<10 }.map { it * it }


    println("The single digit numbers are: ")
    for(i in oneDigit)
        print("$i ")

    println("\nThe Double digit numbers are: ")
    for(i in twoDigit)
        print("$i ")

    println("\nThe single digit square numbers are: ")
    for(i in oneDigitSquared)
        print("$i ")


    var predicate= { i: Int -> i in 100..999}

    println("Predicate all")
    var checkAll= list.all(predicate)
    println(checkAll)

    println("Predicate any")
    var checkAny= list.any(predicate)
    println(checkAny)

    println("Predicate count")
    var count= list.count(predicate)
    println(count)

    println("Predicate find")
    var element= list.find(predicate)
    println(element)


}