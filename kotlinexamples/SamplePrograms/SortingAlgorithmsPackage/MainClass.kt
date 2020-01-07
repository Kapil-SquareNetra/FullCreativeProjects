package com.example.kotlinexamples.SamplePrograms.SortingAlgorithmsPackage

fun main(){

    var arr= intArrayOf(22,100,12,44,2,10)
    println("Before sort")
    for(i in arr){
        println(i)
    }

    var brr= SortingClass.bubbleSort(arr)
    var crr= SortingClass.insertionSort(arr)
    var drr= SortingClass.selectionSort(arr)

    println("\nBubble sort")
    for(i in brr){
        println(i)
    }


    println("\nInsertion sort")
    for(i in crr){
        println(i)
    }

    println("\nSelection sort")
    for(i in drr){
        println(i)
    }





}