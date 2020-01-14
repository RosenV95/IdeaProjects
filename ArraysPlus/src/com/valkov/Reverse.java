package com.valkov;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());//input the length of the array
        int[]array=new int[n];//set the length of the array to the input above

        for(int i=0;i<array.length;i++){
            int number=Integer.parseInt(scanner.nextLine());
            array[i]=number;//attach a number from the input above to the respective place in the array, starting from 0

        }
        for(int i=array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }
    }
}
