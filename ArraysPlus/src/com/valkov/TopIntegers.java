package com.valkov;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        boolean isBigger = true;
        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] <= array[j]) {
                    isBigger = false;
                } else {
                    isBigger = true;
                }

            }
            if (isBigger) {
                System.out.println(array[i] + " ");//the if needs to be outside the for loop otherwise we get an incorrect result because of the incrementation
            }
        }
    }
}