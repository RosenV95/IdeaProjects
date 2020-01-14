package com.valkov;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                result = (char) (((int) text.charAt(i) +
                        3)); //- 65) % 26 + 65);//this resets the alphabet back to "A" if the amount of characters moved go beyond "Z"

            } else {
                result = (char) (((int) text.charAt(i) +
                        3 ));//- 97) % 26 + 97);

            }
            System.out.print((char) result);
        }

    }
}


