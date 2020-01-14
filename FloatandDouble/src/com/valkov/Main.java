package com.valkov;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        // float has a width of 32
        double myDoubleValue = 5d/3d;
        //double has a width of 64
        System.out.println("myIntValue= " + myIntValue);
        System.out.println("myFloatValue= " + myFloatValue);
        System.out.println("myDoubleValue= " + myDoubleValue);

        double numberOfPounds = 200;
        double poundsToKilograms = numberOfPounds*0.45359237d;
        System.out.println("Kilograms= " +poundsToKilograms);
        //90.7185
    }
}
