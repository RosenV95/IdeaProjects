package com.valkov;

import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfTransactions = Integer.parseInt(scanner.nextLine());
        int transactionsMade = 0;
        double sum=0;
        while (transactionsMade < countOfTransactions) {
            double amount = Double.parseDouble(scanner.nextLine());
            if (amount < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n",amount);
            sum+=amount;
            transactionsMade++;
        }
        System.out.printf("Total: %.2f",sum);
    }
}