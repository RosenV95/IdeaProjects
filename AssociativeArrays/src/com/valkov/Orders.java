package com.valkov;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<Double, Double>> myMap = new LinkedHashMap<String, Map<Double, Double>>();


        String input = "";
        while (true) {

            input = scanner.nextLine();
            String[] tokens = input.split(" ");
            String name = tokens[0];
            if ("buy".equals(name)) {
                break;
            }
            double price = Double.parseDouble(tokens[1]);
            double quantity = Double.parseDouble(tokens[2]);
            Map<Double, Double> innerMap = myMap.computeIfAbsent(name,n -> new HashMap<>());
            if (innerMap.isEmpty()) {
                innerMap.put(price,quantity);
            } else {
                innerMap.put(price,quantity + innerMap.remove(innerMap.keySet().iterator().next()));
            }
        }


            System.out.println(myMap);
            System.out.println();

        }

    }