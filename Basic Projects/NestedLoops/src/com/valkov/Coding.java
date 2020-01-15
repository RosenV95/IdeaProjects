package com.valkov;
import java.util.Scanner;

public class Coding {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );

        int n = Integer.parseInt( scanner.nextLine());
        String s = Integer.toString(n);


        for ( int i = s.length()-1; i >= 0; i--) {

            int x = s.charAt(i) - 48;
            int y = x + 33;

            if ( x == 0 ) {
                System.out.println("ZERO");
            } else {

                for ( int g = 1; g <= x; g++) {
                    System.out.printf("%s", (char) (y) );
                }
                System.out.println();
            }
        }
        System.out.println();
    }

}