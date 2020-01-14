package com.valkov;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        String[] array = Arrays.stream(scanner.nextLine().split(" "))
                .map(String::toString)
                .toArray(String[]::new);
        String[] array2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(String::toString)
                .toArray(String[]::new);
        for (int i = 0; i < array.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array[i].equals(array2[j])){
                    System.out.print(array[i]+" ");
                }
            }
        }
    }
}