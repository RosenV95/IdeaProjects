package com.valkov;

import java.util.Scanner;

public class ZooShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogs = Integer.parseInt(scanner.nextLine());
        int otherAnimals = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f lv.",shoppingCalculation(dogs,otherAnimals));
    }
    public static double shoppingCalculation(int dogs, int otherAnimals) {
        if ((dogs < 0 || dogs > 100) && (otherAnimals < 0 || otherAnimals > 100)) {
            return 0;
        } else {
            double foodCalculation = (dogs * 2.50) + (otherAnimals * 4);
            return foodCalculation;
        }
    }

}
