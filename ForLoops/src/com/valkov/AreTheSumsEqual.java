package com.valkov;

import java.util.Scanner;

public class AreTheSumsEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int leftSum=0;
        int rightSum=0;
        for(int i=1; i<=n*2;i++){
            int currentNum=Integer.parseInt(scanner.nextLine());
            if(i<=n){
                leftSum=leftSum+currentNum;
            }else{
                rightSum+=currentNum;
            }

        }
        if(leftSum==rightSum){
            System.out.printf("Yes, sum = %d",leftSum);
        }else{
            System.out.printf("No, diff = %d", Math.abs(leftSum-rightSum));
        }
    }
}
