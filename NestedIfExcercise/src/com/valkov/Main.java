package com.valkov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        double rows = Double.parseDouble(scanner.nextLine());
        double columns = Double.parseDouble(scanner.nextLine());
        if (projection.equals("Premiere")) {
            System.out.printf("%.2f leva", (rows * columns * 12));
        } else if (projection.equals("Normal")) {
            System.out.printf("%.2f leva", (rows * columns * 7.5));
        } else if (projection.equals("Discount")) {
            System.out.printf("%.2f leva", (rows * columns * 5));
        }
    }
}