package com.valkov;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int[] mainarray= Arrays.stream(scanner.nextLine().split(" "))
            .mapToInt(e->Integer.parseInt(e))
            .toArray();
    int rotations=Integer.parseInt(scanner.nextLine());  //determine the number of times an array should be rotated
    for(int i=0;i<rotations;i++){  //Rotate the given array by n times toward left
        int j,first;
        first=mainarray[0];//Stores the first element of the array
        for(j=0;j<mainarray.length-1;j++){
            mainarray[j]=mainarray[j+1];     //Shift element of array by one
        }
        mainarray[j]=first;   //First element of array will be added to the end  
        System.out.println(Arrays.toString(mainarray));

    }
    }
}
