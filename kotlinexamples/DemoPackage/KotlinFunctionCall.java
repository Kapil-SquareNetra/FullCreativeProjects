package com.example.kotlinexamples.DemoPackage;

import com.example.kotlinexamples.DemoPackage.Red;

public class KotlinFunctionCall {


    public static void main(String [] args){

       int sum= Red.add(2,21);

        System.out.println("Sum is :" + sum);



       int max= Red.max(12,21);

        System.out.println("Max of two numbers is: " + max);

    }
}
