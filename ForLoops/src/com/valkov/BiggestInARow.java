package com.valkov;

import java.util.Scanner;

public class BiggestInARow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCount = Integer.parseInt(scanner.nextLine());
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=1; i<=numCount ;i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > max) {
                max = number;

            }
        }
        int sumWithoutMaxNumber=sum-max;
        if(max==sumWithoutMaxNumber){
                System.out.println("Yes");
                System.out.println("Sum = "+max);

        }else{
                System.out.println("No");
                System.out.println("Diff = "+Math.abs(max-sumWithoutMaxNumber));
        }

        }
    }
