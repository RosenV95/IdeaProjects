package com.valkov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = "";


        while (!input.equals("end")) {
            input = scanner.next();
            switch (input) {
                case "Add":
                   int addNumber = Integer.parseInt(scanner.next());
                    myList.add(addNumber);
                    break;
                case "Remove":
                    int removeNumber=Integer.parseInt(scanner.next());
                    myList.remove((Object)removeNumber);
                    break;
                case "RemoveAt":
                    int indexToRemove=Integer.parseInt(scanner.next());
                    myList.remove(indexToRemove);
                    break;
                case "Insert":
                    int insertNumber=Integer.parseInt(scanner.next());
                    int insertAtIndex=Integer.parseInt(scanner.next());
                    myList.add(insertAtIndex,insertNumber);
                    break;



            }


        }
        System.out.println(myList.toString().replaceAll("\\[|,|\\]",""));
    }
}