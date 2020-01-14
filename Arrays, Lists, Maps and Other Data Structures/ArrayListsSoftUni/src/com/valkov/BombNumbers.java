package com.valkov;

import java.util.Arrays;
import java.util.List;

import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collectors;



public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> myList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        ListIterator iterator = myList.listIterator();

        int number = Integer.parseInt(scanner.next());
        int power = Integer.parseInt(scanner.next());

            for (int i = 0; i < myList.size(); i++) {
                int startIndex=i-power;
                int endIndex=i+power+1;
                if (myList.get(i)== number) {
                    if ((endIndex > myList.size())) {
                        myList.subList(startIndex, myList.size()).clear();

                    } else {
                        myList.subList(startIndex, endIndex).clear();



                    }

                }

            }


        int sum = myList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        }

    }

