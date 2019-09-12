package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;


public class TestingMain {
    public static void main(String[] args) {

        if(Calculator.addAToB(6,4)==10) {
            System.out.println("Add test Ok!");
        } else {
            System.out.println("Add test Nok!");
        }

        if(Calculator.subtractBFromA(6,4)==2) {
            System.out.println("Subtract test Ok!");
        } else {
            System.out.println("Subtract test Nok!");
        }



    }


}