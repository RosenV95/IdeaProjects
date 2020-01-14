package com.valkov;

import java.util.Scanner;

public class Main {
   private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);//allows us to type 5 numbers and return them in the form of an array
        for(int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i +", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));

    }

    public static int[] getIntegers(int number) {//Defines the number of array elements
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];//makes the count of array elements equal to the number from the getIntergers , adds flexibility to accept any number

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();//allows user input of values
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i=0; i< array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double)array.length;

    }

}





























        //            int[] myIntArray=new int[10]; //{1,2,3,4,5,6,7,8,9,10};
//        for(int i=0;i<myIntArray.length;i++){
//            myIntArray[i]=i*10;
//        }
//        for(int i=0;i<myIntArray.length;i++){
//            System.out.println("Element "+i+", value is "+myIntArray[i]);
//        }
//        printArray(myIntArray);
//
//        }
//    public static void printArray(int[] array){
//        for(int i=0;i<array.length;i++){
//            System.out.println("Element "+i+", value is "+array[i]);
//        }
//    }

