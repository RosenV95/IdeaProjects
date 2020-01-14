package com.valkov;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfFlowers = scanner.nextLine();
        double flowersAmount = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double price = 0;
        double cost = 0;
        double balance=0;
        if (typeOfFlowers.equals("Roses")) {
            if (flowersAmount <= 80) {
                price = flowersAmount * 5;
            } else {
                price = (flowersAmount * 5) * 0.9;
            }
            if (price > budget) {
                System.out.printf("Not enough money, you need %.2f leva more.", (price - budget));
            } else {
                System.out.printf("Hey, you have a great garden with %.0f Roses and %.2f leva left.", flowersAmount, (budget - price));
            }
        }
        else if (typeOfFlowers.equals("Dahlias")) {
            if (flowersAmount <= 90) {
                price = flowersAmount * 3.80;
            } else {
                price = (flowersAmount * 3.80) * 0.85;
            }
            if (price > budget) {
                System.out.printf("Not enough money, you need %.2f leva more.", (price - budget));
            } else {
                System.out.printf("Hey, you have a great garden with %.0f Dahlias and %.2f leva left.", flowersAmount, (budget - price));
            }
        }
        else if (typeOfFlowers.equals("Tulips")) {
            if (flowersAmount <= 80) {
                price = flowersAmount * 2.80;
            } else {
                price = (flowersAmount * 2.80);
                price*=0.85;
            }
            if (price > budget) {
                balance=price-budget;
                System.out.printf("Not enough money, you need %.2f leva more.", balance);
            } else {
                System.out.printf("Hey, you have a great garden with %.0f Tulips and %.2f leva left.", flowersAmount, (budget - price));
            }

        }
        else if (typeOfFlowers.equals("Narcissus")) {
            if (flowersAmount < 120) {
                price = (flowersAmount * 3);
                cost = price * 0.15;
                price += cost;

            } else {
                price = (flowersAmount * 3);
            }
            if (price > budget) {
                System.out.printf("Not enough money, you need %.2f leva more.", (price - budget));
            } else {
                System.out.printf("Hey, you have a great garden with %.0f Narcissus and %.2f leva left.", flowersAmount, (budget - price));
            }
        }
        else if (typeOfFlowers.equals("Gladiolus")) {
            if (flowersAmount < 80) {
                price = (flowersAmount * 2.5);
                cost = price * 0.2;
                price += cost;

            } else {
                price = (flowersAmount * 2.5);
            }
            if (price > budget) {
                System.out.printf("Not enough money, you need %.2f leva more.", (price - budget));
            } else {
                System.out.printf("Hey, you have a great garden with %.0f Gladiolus and %.2f leva left.", flowersAmount, (budget - price));
            }
        }
    }
}