package com.valkov;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftuniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = Integer.parseInt(scanner.nextLine());
        String input = "";


        Map<String, String> myMap = new HashMap<>();
        for (int i = 0; i < inputCount; i++) {
            input = scanner.nextLine();
            String[] tokens = input.split(" ");
            String action = tokens[0];
            String name = tokens[1];
            String number = tokens[2];
            switch (action) {
                case "register":
                    if (!myMap.containsKey(name)) {
                        myMap.put(name, number);
                        System.out.printf("%s registered %s successfully%n", name, number);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", number);
                    }

                    break;
                case "unregister":
                    if (!myMap.containsKey(name)) {

                        System.out.printf("ERROR: user %s not found%n", name);
                    } else {
                        myMap.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);

                    }

            }
            myMap
                    .forEach((key, value) -> System.out.println(String.format("%s => %s", key, value)));

        }
    }
}