package com.valkov;

import java.util.Scanner;

public class CakeSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int cakeArea = height * width;
        int cakeLeft = 0;
        int cakeTaken = 0;
        while (cakeArea >= 0) {
            String input = scanner.nextLine();
            if (input.equals("STOP")) {
                System.out.printf("%d pieces are left.", cakeLeft);
                break;
            } else {
                cakeTaken = Integer.parseInt(input);
                cakeLeft = cakeArea - cakeTaken;

                cakeArea -= cakeTaken;
            }

            }
        if (cakeLeft < 0) {
            System.out.printf("No more cake left! You need %d pieces more.", (cakeLeft * -1));


        }

        }

    }


