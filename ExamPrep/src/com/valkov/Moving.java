package com.valkov;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int width=Integer.parseInt(scanner.nextLine());
        int length=Integer.parseInt(scanner.nextLine());
        int height=Integer.parseInt(scanner.nextLine());
        String input=scanner.nextLine();
        int freeSpace=width*length*height;


        while(!input.equals("Done")){
            int boxSize=Integer.parseInt(input);
            freeSpace-=boxSize;
            if(freeSpace<0) {
                break;
            }
            else{

                input=scanner.nextLine();
            }

        }
        if(freeSpace>=0){
            System.out.printf("%d Cubic meters left.",freeSpace);
        }else{
            System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(freeSpace));

        }

    }
}
