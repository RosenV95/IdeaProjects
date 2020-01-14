package com.valkov;

import java.util.Scanner;

public class OddsOrEvensSUm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int sum=0;
        int sum2=0;
        for(int i=1;i<=n;i++){
            int currentNum=Integer.parseInt(scanner.nextLine());
            if(i%2==0){
                sum=sum+currentNum;


            }
            else{
                sum2=sum2+currentNum;
            }



        }if(sum==sum2){
            System.out.printf("Yes\nSum = %d",sum);
        }else{
            System.out.printf("No\nDiff = %d", Math.abs(sum-sum2));
        }
    }
}
