package com.valkov;

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
    String input="12 13 14 15 16 29 20";
    String[] numbersSplitAsStrings=input.split(" ");
    int[] numbers=new int[numbersSplitAsStrings.length];
    for(int i=0;i<=numbersSplitAsStrings.length;i++){

        numbers[i]=Integer.parseInt(numbersSplitAsStrings[i]);
        }
}
}