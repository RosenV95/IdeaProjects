package com.valkov;

import java.util.*;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        ArrayList<Integer> dummyList = new ArrayList<>();
        ArrayList<Integer> dummyList2 = new ArrayList<>();
        int sum = 0;
        String input = "";


        while (!input.equals("end")) {
            input = scanner.nextLine();
            String[] tokens = input.split(" ");

            switch (tokens[0]) {
                case "Contains":
                    int containedNumber = Integer.parseInt(tokens[1]);
                    if (myList.contains(containedNumber)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case ("Print"):
                    if (tokens[1].equals("even")) {
                        dummyList.addAll(myList);
                        dummyList.removeIf(i -> i % 2 != 0);
                        System.out.println(dummyList.toString().replaceAll("\\[|,|\\]", ""));
                    } else if (tokens[1].equals("odd")) {
                        dummyList2.addAll(myList);
                        dummyList2.removeIf(i -> i % 2 == 0);
                        System.out.println(dummyList2.toString().replaceAll("\\[|,|\\]", ""));
                    }

                    break;
                case "Get":
                    if (tokens[1].equals("sum")) {
                        for (int i = 0; i < myList.size(); i++) {
                            sum += myList.get(i);
                        }
                        System.out.println(sum);
                    }
                    break;
                case "Filter":
                    if (tokens[1].equals(">=")) {
                        int filterNumber = Integer.parseInt(tokens[2]);
                        for (int i = 0; i < myList.size(); i++) {
                            if (myList.get(i) >= filterNumber) {
                                System.out.print(myList.get(i) + " ");

                            }

                        }


                    } else if (tokens[1].equals("<")) {
                        int filterNumber2 = Integer.parseInt(tokens[2]);
                        for (int i = 0; i < myList.size(); i++) {
                            if (myList.get(i) < filterNumber2) {
                                System.out.print(myList.get(i) + " ");
                            }

                        }


                    } else if (tokens[1].equals("<=")) {
                        int filterNumber3 = Integer.parseInt(tokens[2]);
                        for (int i = 0; i < myList.size(); i++) {
                            if (myList.get(i) <= filterNumber3) {
                                System.out.print(myList.get(i) + " ");
                            }

                        }

                    } else if (tokens[1].equals(">")) {
                        int filterNumber4 = Integer.parseInt(tokens[2]);
                        for (int i = 0; i < myList.size(); i++) {
                            if (myList.get(i) > filterNumber4) {
                                System.out.print(myList.get(i) + " ");
                            }

                        }
                    }System.out.println();
                    break;


            }


        }

    }
}

