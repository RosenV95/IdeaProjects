package com.valkov;

import java.util.Scanner;

public class PointinRect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = java.lang.Double.parseDouble(scanner.nextLine());
        double y1 = java.lang.Double.parseDouble(scanner.nextLine());
        double x2 = java.lang.Double.parseDouble(scanner.nextLine());
        double y2 = java.lang.Double.parseDouble(scanner.nextLine());
        double x = java.lang.Double.parseDouble(scanner.nextLine());
        double y = java.lang.Double.parseDouble(scanner.nextLine());
        if (x >= x1 && x <= x2 && y >= y1 && y <= y2) {
            System.out.println("Inside");

        } else {
            System.out.println("Outside");

        }

    }
}
