package com.example.kotlinexamples.DataClassPackage

data class DataClass (val brandName: String, val cost: Double){

    fun show(){

        println("The $brandName laptop costs Rs.$cost")
    }

}