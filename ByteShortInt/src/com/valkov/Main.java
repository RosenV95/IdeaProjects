package com.valkov;

public class Main {

    public static void main(String[] args) {
	int myMinValue= -2_147_483_648;
	int myMaxValue= 2_147_483_647;
	int myTotal = (myMinValue/2);

	//int has a width of 32

        byte myByteValue = -128;
        //byte has a width of 8
        short myShortValue = 32767;
        //short has a width of 16
        long myLongValue = 325;
        //long has a width of 64 and is always indexed with an L in the end.

        byte number1 = 10;
        short number2 = 100;
        int number3 = 1000;
        long number4 = 50000L + 10L*(number1+number2+number3);
        System.out.println(number4);
        System.out.println("sup");
    }
}
