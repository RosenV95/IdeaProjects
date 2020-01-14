package com.valkov;



import java.util.Arrays;
import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] firstLineOutput=new String[n];
        String[] secondLineOutput=new String[n];


        for(int i=1;i<=n;i++){
           String[] input= Arrays.stream(scanner.nextLine().split(" "))
                   .map(String::toString)
                   .toArray(String[]::new);
           if(i%2!=0){//Ako i e nechetno
              firstLineOutput[i-1] = input[0];//parviq element na parviq red e raven na parviq element ot vavedeniq masiv
              secondLineOutput[i-1] = input[1];//parviq element na vtoriq red e raven na vtoriq element ot vavedeniq masiv
           }

           else {//
               firstLineOutput[i-1] = input[1];
               secondLineOutput[i-1] = input[0];
           }
           }
        System.out.println(" "+Arrays.toString(firstLineOutput));
        System.out.println(" "+Arrays.toString(secondLineOutput));
        }

    }
