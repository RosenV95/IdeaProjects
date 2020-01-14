package com.valkov;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int days=Integer.parseInt(scanner.nextLine());
        int bakers=Integer.parseInt(scanner.nextLine());
        int cakes=Integer.parseInt(scanner.nextLine());
        int waffles=Integer.parseInt(scanner.nextLine());
        int pancakes=Integer.parseInt(scanner.nextLine());
        double cakesProfit=cakes*45;
        double wafflesProfit=waffles*5.80;
        double pancakesProfit=pancakes*3.20;
        double profitPerDayByOne=cakesProfit+wafflesProfit+pancakesProfit;
        double profitsPerDayByAll=profitPerDayByOne*bakers;
        double totalProfit=profitsPerDayByAll*days;
        double expenses=totalProfit/8;
        double finalProfit=totalProfit-expenses;
        System.out.printf("%.2f",finalProfit);


    }
}
