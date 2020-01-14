package com.valkov;

import java.util.Scanner;

public class MovieStars {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double budget = Double.parseDouble(scanner.nextLine());

            String input = scanner.nextLine();
            while (!input.equalsIgnoreCase("ACTION")) {
                if (input.length() > 15) {
                    budget -= budget * 0.20;
                } else {
                    budget -= Double.parseDouble(scanner.nextLine());
                }

                if (budget < 0) {
                    break;
                }

                input = scanner.nextLine();
            }

            if (budget >= 0) {
                System.out.printf("We are left with %.2f leva.", budget);
            } else {
                System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
            }
        }
    }