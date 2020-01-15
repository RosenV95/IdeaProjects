package com.valkov;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int firstSum=0;

        int[]firstArray= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();
        int[]secondArray= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();
        for(int i=0;i<firstArray.length;i++){
            if(firstArray[i]!=secondArray[i]){
                System.out.println("Arrays are not identical. Found difference at " +i+" index.");
                break;
            }
            firstSum+=firstArray[i];

        }


        if(Arrays.equals(firstArray,secondArray)){
            System.out.println("Arrays are identical. Sum: "+firstSum);
        }
    }
}
