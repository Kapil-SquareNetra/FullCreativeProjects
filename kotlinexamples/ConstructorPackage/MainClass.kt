package com.example.kotlinexamples.ConstructorPackage


class SubSampleClass: SampleClass(){
    override fun printer(){
        println("GGWP")
    }

}

open class SubSampleClass2: SampleClass("King",22){


}

class GrandChildClass: SubSampleClass2(){

    init {
        super.name="Anton Parr"
        super.num=77
    }
    init {

    }




}


class AbstractExtender() : PeopleClass(){

    override fun malePeople(){
        println("Males")
    }

    override fun femalePeople(){
        println("Females")
    }
}





fun main(Args:Array<String>){

    var s2: SampleClass = SubSampleClass()
    s2.printer()

    var s1: SampleClass= SubSampleClass2()
    s1.printer()

    var s3: GrandChildClass= GrandChildClass()
    s3.printer()

    var ae= AbstractExtender()
    ae.malePeople()
    ae.femalePeople()
}