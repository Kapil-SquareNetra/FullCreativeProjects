package com.example.kotlinexamples.InterfacePackage

class Sample : Funnable,I2{
    override fun display(){
        println("Display function implemented by Sample")
    }

    override fun show(){
        println("Show method in Sample Class")
        super<I2>.show()
        super<Funnable>.show()
    }
}



fun main(Args: Array<String>){

    var s1= Sample()
    s1.display()
    s1.show()


}