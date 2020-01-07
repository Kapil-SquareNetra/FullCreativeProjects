package com.example.kotlinexamples.HigherOrderFunctionsPackage

fun main(){

    var hof= HigherOrderFunction()


    //var lamda: (Int, Int)-> Int={x,y -> x+y}
    hof.add(27,3,{x,y -> x+y})

    hof.massAdd( 100,120,140,150,160,170,180,190,100)

  with(hof){
      name="kapil"
      rollNum=21
      height= 5.11
  }.toString()


    hof.apply {
        name="sven"
        rollNum=7
        height= 8.11
    }.printDetails()   // initializing variables and calling functions using apply


}


class HigherOrderFunction{

    var name: String=""
    var rollNum: Int= -1
    var height: Double= 0.0



    fun add(num1: Int,num2: Int, sum:(Int, Int)-> Int){

        println("The sum is ${sum(num1,num2)} ")

    }


    fun massAdd(vararg values: Int){    // varargs

        var sum: Int=0
        for (i in values) sum+=i
        println(sum)

    }

    fun printDetails(){
        println("warrior $name of roll number $rollNum towers to a height of $height")
    }

}


