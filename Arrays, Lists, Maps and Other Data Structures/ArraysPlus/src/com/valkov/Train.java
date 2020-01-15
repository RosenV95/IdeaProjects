package com.valkov;


import java.util.Arrays;
import java.util.Scanner;

public class Train {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int lenght = Integer.parseInt(scanner.nextLine());
        int[] array=new int[lenght];
        int sum=0;
        for(int i=0;i<lenght;i++){
            array[i]=scanner.nextInt();
            sum+=array[i];
        }
        String joined=String.join(" ", Arrays.stream(array).mapToObj(String::valueOf).toArray(n -> new String[n]));
        System.out.println(joined);

        System.out.println(sum);
    }

}