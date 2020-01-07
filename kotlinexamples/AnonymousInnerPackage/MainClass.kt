package com.example.kotlinexamples.AnonymousInnerPackage

class MainClass{
    fun main(){

        var mc: Funnable= object : Funnable{

            override fun display() {
                println("This is anonymous inner class")
            }
        }

    }
}


