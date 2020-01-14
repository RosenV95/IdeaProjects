package com.valkov;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //byte
        //short
        //int
        //long
        //char
        //boolean
        //float
        //double
        //these datatypes are primitive
        String myString = "This is a string";
        myString = myString + ", and this is more";
        System.out.println(myString);

        String numberString = "250.50";
        numberString = numberString + 50;
        System.out.println(numberString);
        //string does not do calculations, it treats numeric operations like a text;
        int myInt = 50;
        String lastString = "10";
        lastString = lastString + myInt;
        System.out.println(lastString);
        double doubleNumber = 124.20;
        lastString = doubleNumber + lastString;
        System.out.println(lastString);

    }
}
