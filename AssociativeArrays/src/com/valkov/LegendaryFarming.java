package com.valkov;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class LegendaryFarming  {
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
        int motesCount = 0;
        int shardsCount = 0;
        int fragmentsCount = 0;
        LinkedHashMap<String, Integer> keyMaterials = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> trashMaterials = new LinkedHashMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);
        String winner = "";
        boolean flag=false;
        do {
            String[] data = scanner.nextLine().split("\\s+");
            for (int i = 0; i < data.length; i += 2) {
                int quantity = Integer.parseInt(data[i]);
                String material = data[i + 1].toLowerCase();
                if (!keyMaterials.containsKey(material)) {
                    if (!trashMaterials.containsKey(material)) {
                        trashMaterials.put(material, quantity);

                    } else {
                        trashMaterials.put(material, trashMaterials.get(material) + quantity);
                    }
                } else {
                    keyMaterials.put(material, keyMaterials.get(material) + quantity);
                    if (keyMaterials.get(material) >= 250) {
                        keyMaterials.put(material, keyMaterials.get(material) - 250);

                        winner = material;
                        flag=true;
                        break;
                    }

                }
            }

        } while (!flag);
        if (winner.equals("shards")) {
            System.out.println("Shadowmourne obtained!");


        } else if (winner.equals("motes")) {
            System.out.println("Dragonwrath obtained!");

        } else if (winner.equals("fragments")) {
            System.out.println("Valanyr obtained!");

        }
        keyMaterials
                .entrySet().stream().sorted((e1,e2)-> {
            int sort = Integer.compare(e2.getValue(),//compares by value
                    e1.getValue());
            if (sort == 0) {
                sort = e1.getKey().compareTo(e2.getKey());//compares by key
            }
            return sort;
        }).forEach(e->{
            System.out.println(String.format(
                    "%s: %d",e.getKey(),e.getValue()
            ));
        });
        trashMaterials.entrySet().stream().sorted((e1,e2)->e1.getKey().compareTo(e2.getKey()))
                .forEach(e-> {
                    System.out.println(String.format(
                            "%s: %d", e.getKey(), e.getValue()));
                });

    }
}
