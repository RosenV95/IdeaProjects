package com.valkov;

import java.util.Scanner;

public class Graduation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int years = 1;
        double sum = 0;
        double grade=0;

        while (years <= 12) {

            grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4.00) {
                sum += grade;
                years++;
            } else {
                System.out.printf("%s has been excluded at %d grade", name, years);
                break;

            }

        }
            double average = sum / 12;

            if (grade >= 4) {
                System.out.printf("%s graduated. Average grade: %.2f", name, average);
            }

        }

    }
