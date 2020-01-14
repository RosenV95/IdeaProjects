package com.valkov;

import java.util.*;


public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int names = Integer.parseInt(scanner.nextLine());
        List<String> isGoing = new ArrayList<>();
        List<String> isNotGoing=new ArrayList<>();
        List<String> alreadyOnList=new ArrayList<>();
        String[] tokens = new String[0];
        for (int i = 0; i < names; i++) {

            String whosGoingorNot = scanner.nextLine();
            tokens = whosGoingorNot.split(" ");
            if (tokens[1].equals("is") && tokens[2].equals("going!")) {

                if (isGoing.contains(tokens[0])) {
                    alreadyOnList.add(tokens[0]);


                }
                isGoing.add(tokens[0]);









            } else if (tokens[1].equals("is") && tokens[2].equals("not") && tokens[3].equals("going!")) {
                isNotGoing.add(tokens[0]);
                if (isGoing.contains(tokens[0])) {
                    isGoing.remove(tokens[0]);
                    isNotGoing.remove(tokens[0]);

                }



            }
            else{
                break;
            }
        }
        Set<String> s = new LinkedHashSet<>(isGoing);

        for(String name:alreadyOnList){
            if(isGoing.contains(name)) {

                System.out.println(name + " is already in the list!");


            }
        }
        for(String name2:isNotGoing) {
            if (!alreadyOnList.contains(name2)) {
                System.out.println(name2 + " is not in the list!");

            }

        }
        for(String name3:s){
            System.out.println(name3);


        }




    }
}
