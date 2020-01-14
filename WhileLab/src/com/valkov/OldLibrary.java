package com.valkov;

import java.util.Scanner;

public class OldLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchedBookName = scanner.nextLine();
        int bookCount = Integer.parseInt(scanner.nextLine());
        int countedBooks = 0;
        boolean isFound = false;
        while (!isFound && (bookCount > countedBooks)) {
            String otherBookName = scanner.nextLine();
            if (searchedBookName.equals(otherBookName)) {
                isFound = true;
                break;

            } else {
                countedBooks++;


            }


        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.", countedBooks);
        } else {
            System.out.printf("The book you search is not here!\nYou checked %d books.",countedBooks);
        }

    }
}