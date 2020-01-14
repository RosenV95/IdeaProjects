package com.valkov;

import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double length=Double.parseDouble(scanner.nextLine());
        double width=Double.parseDouble(scanner.nextLine());
        double wardrobeSide=Double.parseDouble(scanner.nextLine());
        double hallArea=(length*100)*(width*100);
        double areaWardrobe=(wardrobeSide*100)*(wardrobeSide*100);
        double benchArea=hallArea/10;
        double freeSpace=hallArea-areaWardrobe-benchArea;
        double dancers=freeSpace/(40+7000);
        System.out.printf("%.0f",Math.floor(dancers));
    }
}
