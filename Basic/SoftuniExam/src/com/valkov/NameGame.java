package com.valkov;

import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = 0;
        int pointSum = 0;
        int maxPoints = Integer.MIN_VALUE;
        int numberCount = 0;
        int number=0;



        while (true) {
            String name = scanner.nextLine();
            for (int i = 0; i < name.length(); i++) {
               number = Integer.parseInt(scanner.nextLine());
                numberCount++;
                System.out.println(numberCount);
                int currentChar = name.charAt(i);
                if (number == currentChar) {
                    points = 10;
                } else {
                    points = 2;
                }
            }
            pointSum += points;
            System.out.println(pointSum);
            maxPoints = pointSum;
            System.out.println(maxPoints);




        }


    }
}
