package com.example.kotlinexamples.ConstructorPackage

open class SampleClass() {
        var name: String="Default"
        var num: Int=0

    init {
        name="GODLIKE"
        num=666
    }


    constructor(strName: String, sNum: Int):this(){
        this.num=sNum
        this.name=strName
    }

   open fun printer(){

        println("The Entry is $name : $num")
    }

}