package com.valkov;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";


        while (!"end".equals(input)) {
            String reversed = "";
            input = scanner.nextLine();

            for (int i = input.length() - 1; i >= 0; i--) {
                reversed += input.charAt(i);


            }
            if(!input.equals("end")) {
                System.out.printf("%s=%s%n", input, reversed);
            }

        }

    }

}