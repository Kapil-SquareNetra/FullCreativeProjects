package com.example.kotlinexamples.InfixExample

fun main(Args: Array<String>){

    var a1=DemoClass()
    a1.jobDescription="Writing perfect codes"

    var a2=DemoClass()
    a2.jobDescription="Manual testing of codes"

    var a3= a1 merge a2
    println(a3.jobDescription)


    var usrInput= "Your JD is "


    var finalOutput= a2 * usrInput

    print(finalOutput)


}

infix fun DemoClass.merge(dm : DemoClass): DemoClass{

    var newClassObj= DemoClass()
    newClassObj.jobDescription= this.jobDescription + " and  " + dm.jobDescription

    return newClassObj
}

 infix operator fun DemoClass.times (str: String): String{

     return str + " " + this.jobDescription
}