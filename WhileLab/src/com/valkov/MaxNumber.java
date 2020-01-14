package com.valkov;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int max=Integer.MIN_VALUE;
        int countNumbers=1;
        while(countNumbers<=n){
            int number=Integer.parseInt(scanner.nextLine());
            if(number>max){
                max=number;
            }
            countNumbers++;
        }
        System.out.println(max);

    }
}
