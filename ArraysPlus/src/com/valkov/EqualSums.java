package com.valkov;

import java.io.Console;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int sumLeft = 0;
        int sumRight = 0;
        boolean found = true;
        for (int i = 0; i < array.length - 1; i++) {
            for (int l = 0; l < i; l++) {
                //sum LEFT numbers from current position[i]:
                sumLeft += array[l];
            }
            for (int r = i + 1; r < array.length; r++) {
                //sum RIGHT numbers from current position[i]:
                sumRight += array[r];
            }
            if (sumLeft == sumRight) {
                System.out.println(i);
                found = true;
            } else //if not => reset sums:
            {
                sumLeft = 0;
                sumRight = 0;
            }
        }


        if (found == false)
        {
            System.out.println("no");
        }
    }
}

