package com.valkov;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int biggestLength = 0;
        int longestSeqNumber = 0;
        int index = 0;


        for (int i = 0; i < array.length; i++) {

            int currentLength = 0;
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    currentLength++;
                    index = i;
                    if (currentLength > biggestLength) {
                        biggestLength = currentLength;
                        longestSeqNumber = index;
                    }
                    } else {
                        break;
                    }
                }
            }

            for (int i = 0; i < biggestLength; i++) {
                System.out.print(array[longestSeqNumber + i] + " ");
            }


        }
    }
