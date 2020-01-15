package com.valkov;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int count = 1;
        int i = 1;
        boolean breakChecker = false;

        while (i <= n) {

            int j = 1;
            if (breakChecker) break;

            while (j <= i) {

                System.out.print(count);

                if (count==n) {
                    breakChecker = true;
                    break;
                } else {
                    count++; //j++ is down, cause j++ will f**k next if statement.
                }            //count++ is here, because we don't want spaces at the end of every row. (even if its short)

                if (j==i) { //because we don't want spaces in the end of the row
                    System.out.println();
                } else {
                    System.out.print(" ");
                }

                j++; //it has to be here downstairs, especially it has a dog in any fight upstairs...
            }

            i++;
        }
    }
}
