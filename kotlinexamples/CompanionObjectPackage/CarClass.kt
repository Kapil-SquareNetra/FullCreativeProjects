package com.example.kotlinexamples.CompanionObjectPackage

class CarClass {

    companion object{
       @JvmStatic // automatically creates getter and setter methods for the variables
        var wheel: Int=0

        @JvmStatic // makes the method static
        fun wheels(){
            println("The no. of wheels is: $wheel" )
        }

    }


}

