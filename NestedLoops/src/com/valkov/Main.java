package com.valkov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int num = Integer.parseInt(scanner.nextLine());
        System.out.println(num);
	while(num!=1){
        num-=1;
        System.out.println(num);
    }



    }
}
