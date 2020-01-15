package com.valkov;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> train = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxSpace = Integer.parseInt(scanner.nextLine());
        String input="";
        while (!input.equals("end")) {
            input=scanner.nextLine();
            String[] tokens = input.split(" ");
            if (tokens[0].equals("Add")) {
                int addPassengers = Integer.parseInt(tokens[1]);
                if (addPassengers <= maxSpace) {
                    train.add(addPassengers);

                }
            }else {
                    int addToWagons;
                try {
                    addToWagons = Integer.parseInt(input);
                }
                catch (NumberFormatException e)
                {
                    addToWagons = 0;
                }
                    for (int i = 0; i < train.size(); i++) {
                        if (train.get(i) + addToWagons<= maxSpace) {
                            train.set(i,train.get(i)+addToWagons);
                            break;

                        }
                    }

                }


            }
        System.out.println(train.toString().replaceAll("\\[|,|\\]", ""));
        }
    }


