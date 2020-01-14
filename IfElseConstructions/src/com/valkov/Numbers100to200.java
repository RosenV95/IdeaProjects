package com.valkov;

import java.util.Scanner;

public class Numbers100to200 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=Integer.parseInt(scanner.nextLine());
        if(num1<100){
            System.out.println("Less than 100");
        }
        else if(num1>=100 && num1<=200){
            System.out.println("Between 100 and 200");
        }
        else{
            System.out.println("Greater than 200");
        }
    }
    }