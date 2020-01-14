package com.valkov;

import java.util.Scanner;

public class ChristmasDecorNested {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String decorPurchased="";
        while (!decorPurchased.equals("Stop")) {
            decorPurchased = scanner.nextLine();
            for (int i = 0; i <decorPurchased.length(); i++) {
                int currentChar = decorPurchased.charAt(i);
                if(decorPurchased.equals("Stop")) {
                    break;
                }

                budget-=currentChar;


            }


            if(budget<0){
                break;
            }else if(!decorPurchased.equals("Stop")){
                System.out.println("Item successfully purchased!");

            }

        }
        if(budget>=0)
            System.out.printf("Money left: %d",budget);
        else{
            System.out.println("Not enough money!");
        }
    }
}
