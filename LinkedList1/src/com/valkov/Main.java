package com.valkov;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> myArray=new ArrayList<String>();
        for(int i=0;i<10;i++){
            String addString=scanner.nextLine();
            myArray.add(addString);

        }
    }
}
