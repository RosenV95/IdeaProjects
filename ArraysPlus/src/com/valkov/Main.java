package com.valkov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfDay=Integer.parseInt(scanner.nextLine());
        String[] daysAsString={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        if(numberOfDay<=0 || numberOfDay>7){
            System.out.println("Invalid day!");
        }
        else{
            System.out.println(daysAsString[numberOfDay-1]);
        }
    }
}
