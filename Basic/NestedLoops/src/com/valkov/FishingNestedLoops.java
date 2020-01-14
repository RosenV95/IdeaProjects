package com.valkov;
import java.util.Scanner;

public class FishingNestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quota = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int fishCounter = 0;
        double profit = 0;
        double lost = 0;
        int fishValue = 0;

        while (!input.equals("Stop")) {
            String fishName = input;
            double fishKg = Double.parseDouble(scanner.nextLine());

            for (int i = 0; i < fishName.length(); i++) {

                fishValue += (int) fishName.charAt(i);
            }
            fishCounter++;

            if (fishCounter % 3 == 0) {
                profit += fishValue / fishKg;
            } else {
                lost += fishValue / fishKg;
            }

            if (fishCounter == quota) {
                System.out.println("Lyubo fulfilled the quota!");
                break;
            }
            fishValue = 0;
            input = scanner.nextLine();
        }

        if (profit >= lost) {
            System.out.printf("Lyubo's profit from %d fishes is %.2f leva.", fishCounter, profit - lost);
        } else {
            System.out.printf("Lyubo lost %.2f leva today.", lost - profit);
        }
    }
}