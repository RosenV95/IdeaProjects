package com.valkov;
import java.util.Scanner;

public class PrimeAndSubprime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumPrime = 0;
        int sumNonprime = 0;

        while (!"stop".equals(input)) {

            int num = Integer.parseInt(input);
            int count = 0;

            for (int i = 2; i <= num/2; i++) {

                if (num % i == 0) {
                    count++;
                    break;
                }

            }

            if ( num < 0 ) {
                System.out.println("Number is negative.");
            } else if ( count > 0 || num == 1) {
                sumNonprime+=num;
            } else {
                sumPrime+=num;
            }

            input = scanner.nextLine();


        }

        System.out.printf("Sum of all prime numbers is: %d\n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonprime);

    }
}

