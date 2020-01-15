package com.valkov;

import java.util.Scanner;

public class Vacay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scan.nextLine());
        double curentMoney = Double.parseDouble(scan.nextLine());
        int count = 0;
        int days = 0;


        while (curentMoney < moneyNeeded) {
            String action = scan.nextLine();
            double amount = Double.parseDouble(scan.nextLine());
            days++;
            if (action.equals("spend")) {
                curentMoney = curentMoney - amount;
                count++;
                if (curentMoney <= 0) {
                    curentMoney = 0;
                } else if (count > 5) {
                    System.out.println("You can't save the money.");
                    System.out.printf("%d", count);
                    break;
                }
            }else if(action.equals("save")){
                count = 0;
                curentMoney = curentMoney + amount;
                if(curentMoney >= moneyNeeded){
                    System.out.printf("You saved the money for %d days.",days);

                }
            }
        }
    }
}