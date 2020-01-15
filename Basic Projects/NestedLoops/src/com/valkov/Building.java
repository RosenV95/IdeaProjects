package com.valkov;


import java.util.Scanner;

public class Building {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int endFloor = Integer.parseInt(scanner.nextLine()); //етажите
        int count = Integer.parseInt(scanner.nextLine()); //броят на помещенията


        for (int floor = endFloor; floor >= 1; floor--) {
            for (int room = 0; room < count ; room++) {
                if(floor == endFloor){
                    System.out.printf("L%d%d ", floor, room);
                } else if(floor % 2 == 0){
                    System.out.printf("O%d%d ", floor,room);
                } else if (floor % 2 == 1){
                    System.out.printf("A%d%d ", floor, room);
                }
            }
            System.out.println();
        }




    }
}
