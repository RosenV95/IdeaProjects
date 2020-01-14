package com.valkov;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int length=Integer.parseInt(scanner.nextLine());
        int width=Integer.parseInt(scanner.nextLine());
        int height=Integer.parseInt(scanner.nextLine());
        double percentage=Double.parseDouble(scanner.nextLine());
        int volume=length*width*height;
        double litres=volume*0.001;
        double percentageReal=percentage*0.01;
        double litresFinal=litres*(1-percentageReal);
        System.out.printf("%.3f",litresFinal);

    }

}
