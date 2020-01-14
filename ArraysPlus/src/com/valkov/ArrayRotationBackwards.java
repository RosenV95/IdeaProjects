package com.valkov;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotationBackwards {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int array[]= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            int j,last;
            last=array[array.length-1];//stores the last element of the array
            System.out.println(last+" last value");
            for(j=array.length-1;j>0;j--) {//j determines the position in the ARRAY
                array[j] = array[j - 1];//shift the elements of the array by one
                System.out.println(array[j]);

            }
            array[0]=last;//the last element will be added to the start of the array
            System.out.println(Arrays.toString(array));
        }
    }
}
