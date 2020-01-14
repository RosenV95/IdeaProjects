package com.valkov;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        System.out.println(Calculate(tokens[0],tokens[1]));


    }

    public static int Calculate(String string1, String string2) {

        int sum = 0;
        int temporarySum = 0;
        char[] firstWord = string1.toCharArray();
        char[] secondWord = string2.toCharArray();
        int minLenght = Math.min(firstWord.length, secondWord.length);
        int maxLenght = Math.max(firstWord.length, secondWord.length);
        for (int i = 0; i <minLenght ; i++) {
            temporarySum=(int)firstWord[i]*(int)secondWord[i];
            sum+=temporarySum;

        }
        if(firstWord.length<secondWord.length){
            for (int i = minLenght; i < maxLenght-1 ; i++) {
                sum+=secondWord[i];
                
            }
        }else if(firstWord.length>secondWord.length){
            for (int i = minLenght; i <maxLenght-1 ; i++) {
                sum+=firstWord[i];

            }
        }
    return sum;
    }

}
