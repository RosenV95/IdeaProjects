package com.valkov;



import java.util.Scanner;

public class InchesToCentimetres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.2f",inchesToCm(inches));

    }
    public static double inchesToCm(double inches){
        double cm = inches*2.54;
        return cm;
    }

}
