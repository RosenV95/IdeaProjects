package com.valkov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
	String[] input=scanner.nextLine().split(" ");
	String result="";
        for (int i=0;i<input.length;i++) {
            String el=input[i];
            int lenght=el.length();
            for (int j = 0; j < lenght; j++) {
                result+=el;
            }
            
        }
        System.out.println(result);
    }
}
