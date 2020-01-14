package com.valkov;

import java.util.Scanner;

    public class Salary {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            int salary = Integer.parseInt(scanner.nextLine());
            int globa = 0;
            int left = salary;
            for (int i = 1; i <= n; i++) {
                String type = scanner.nextLine();
                switch (type) {
                    case "Facebook":
                        salary -= 150;
                        break;
                    case "Instagram":
                        salary -= 100;
                        break;
                    case "Reddit":
                        salary -= 50;
                        break;
                }
                if (salary <= 0) {
                    System.out.println("You have lost your salary.");
                    return;
                }
            }
            System.out.println(salary);
        }
    }
