package com.valkov;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        int countCoins = 0;
        change = Math.floor(change * 100); // change in coins

        while (change > 0)
        {
            if (change>=200)
            {
                change = change - 200;
                
                countCoins++;
            }
            else if (change>=100)
            {
                change = change - 100;
                countCoins++;
            }
            else if (change>=50)
            {
                change = change - 50;
                countCoins++;
            }
            else if (change>=20)
            {
                change = change - 20;
                countCoins++;
            }
            else if (change >= 10)
            {
                change = change - 10;
                countCoins++;
            }
            else if (change >= 5)
            {
                change = change - 5;
                countCoins++;
            }
            else if (change >= 2)
            {
                change = change - 2;
                countCoins++;
            }
            else if (change >= 1)
            {
                change = change - 1;
                countCoins++;
            }
        }
        System.out.println(countCoins);

    }
}

