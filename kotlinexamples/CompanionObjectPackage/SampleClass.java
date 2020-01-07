package com.example.kotlinexamples.CompanionObjectPackage;

public class SampleClass {

    public static void main(String[] args){

        CarClass.setWheel(3);
        CarClass.wheels();
        System.out.println("The auto has " + CarClass.getWheel() + " wheels");


    }
}
