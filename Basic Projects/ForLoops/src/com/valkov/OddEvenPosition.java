package com.valkov;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCount = Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double evenSum = 0;
        double evenMax = Double.NEGATIVE_INFINITY;
        double evenMin = Double.MAX_VALUE;
        double oddMax = Double.NEGATIVE_INFINITY;
        double oddMin = Double.MAX_VALUE;
        for (double i = 1; i <= numCount; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                if (number > evenMax) {
                    evenMax = number;

                }
                if (number < evenMin) {
                    evenMin = number;

                }
                evenSum += number;


            } else {
                if (number > oddMax) {
                    oddMax = number;

                }
                if (number < oddMin) {
                    oddMin = number;

                }
                oddSum += number;

            }


        }
        System.out.printf("OddSum=%.2f,\n", oddSum);
        if(oddMin==Double.MAX_VALUE){
            System.out.printf("OddMin=No,\n");
        }else {
            System.out.printf("OddMin=%.2f,\n", oddMin);
        }
        if(oddMax==Double.NEGATIVE_INFINITY){
            System.out.printf("OddMax=No,\n");
        }else {
            System.out.printf("OddMax=%.2f,\n", oddMax);
        }
        System.out.printf("EvenSum=%.2f,\n", evenSum);
        if(evenMin==Double.MAX_VALUE){
            System.out.printf("EvenMin=No,\n");
        }else {
            System.out.printf("EvenMin=%.2f,\n", evenMin);
        }
        if(evenMax==Double.NEGATIVE_INFINITY){
            System.out.printf("EvenMax=No\n");
        }else {
            System.out.printf("EvenMax=%.2f\n", evenMax);
        }


        }
    }

