package com.example.kotlinexamples.Functions

fun main(args: Array<String>){

    var a1=ClassA()
    var a2=ClassA()
    print("Enter your skill: ")
    a1.skill= readLine()
    print("Enter your skill: ")
    a2.skill= readLine()


    var a3=a1.plus(a2)

    a1.show()
    a2.show()
    a3.show()


}

fun ClassA.plus(e : ClassA): ClassA{
    var newClass=ClassA()

    newClass.skill=this.skill + "-" + e.skill
    return newClass
}