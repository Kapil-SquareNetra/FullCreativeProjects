package com.example.kotlinexamples.CompanionObjectPackage

class FactoryMethodClass {

    companion object{
      fun create(): FactoryMethodClass= FactoryMethodClass()
    }

    fun display(){
        println("Hello ji")
    }

}