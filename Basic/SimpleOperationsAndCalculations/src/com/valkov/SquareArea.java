package com.valkov;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squareSide = Integer.parseInt(scanner.nextLine());
        System.out.println(squareArea(squareSide));
    }

    private static int squareArea(int squareSide) {
        int areaCalculation = squareSide * squareSide;
        return areaCalculation;

    }
}