package com.valkov;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        double productPrice=0;
        int    productCount=0;
        double priceSum=0;
        while(true) {
            String productName = scanner.nextLine();
            if(productName.equals("Stop")) {
                System.out.printf("You bought %d products for %.2f leva.",productCount,priceSum);
                break;
            }
            productPrice = Double.parseDouble(scanner.nextLine());
            productCount++;
            if (productCount % 3 == 0) {
                productPrice /= 2;
            }
            priceSum+=productPrice;

            if(priceSum>budget){
                System.out.printf("You don't have enough money!\n You need %.2f leva!",priceSum-budget);
                break;
            }


        }

    }
}
