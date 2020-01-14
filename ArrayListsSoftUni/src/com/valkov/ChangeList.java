package com.valkov;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = "";
        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            command = scanner.nextLine();
            switch (tokens[0]) {
                case "Delete":
                    int deleteElemenet = Integer.parseInt(tokens[1]);
                    if(myList.contains(deleteElemenet)) {
                        myList.removeAll(Collections.singleton(deleteElemenet));

                    }
                    break;
                case "Insert":
                    int elementToInsert=Integer.parseInt(tokens[1]);
                    int position=Integer.parseInt(tokens[2]);
                    if(position>=0) {
                        myList.add(position, elementToInsert);
                    }
                    break;
            }

        }




        System.out.println(myList.toString().replaceAll("\\[|,|\\]", ""));
    }
    }

