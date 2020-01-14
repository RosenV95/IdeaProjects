package com.valkov;

import java.util.Scanner;

public class SumNumbersFor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfInputs=Integer.parseInt(scanner.nextLine());
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=numberOfInputs;i++){
            int n=Integer.parseInt(scanner.nextLine());
            if(n>max){
                max=n;
            }
            if(n<min){
                min=n;
            }


            }
        System.out.println("Max number: "+max);
        System.out.println("Min number: "+min);


        }
    }

