package com.valkov;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int squareMetres=Integer.parseInt(scanner.nextLine());
        double price=squareMetres*7.61;
        double discountedAmount=0.18*price;
        double discountedPrice=price-discountedAmount;
        System.out.printf("The final price is %.2f lv.\n",discountedPrice);
        System.out.printf("The discount is %.2f lv.",discountedAmount);


    }

}
