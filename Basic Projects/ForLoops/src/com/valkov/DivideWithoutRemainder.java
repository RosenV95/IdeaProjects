package com.valkov;

import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCount = Integer.parseInt(scanner.nextLine());
        double remainder2=0;
        double remainder3=0;
        double remainder4=0;
        for (int i=1;i<=numCount;i++){
            double n=Double.parseDouble(scanner.nextLine());
            if(n%2==0){
                remainder2++;


            }
            if(n%3==0){
                remainder3++;


            }
            if(n%4==0){
                remainder4++;

            }

        }
        double p1=((remainder2/10*100)/numCount)*10;
        double p2=((remainder3/10*100)/numCount)*10;
        double p3=((remainder4/10*100)/numCount)*10;
        System.out.printf("%.2f%%\n",p1);
        System.out.printf("%.2f%%\n",p2);
        System.out.printf("%.2f%%\n",p3);
    }
}
