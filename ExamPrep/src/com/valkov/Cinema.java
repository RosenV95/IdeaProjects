package com.valkov;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cinemaCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int peopleCount = 0;
        int pricePerTicket = 5;
        int totalSum = 0;


        while (!input.equals("Movie Time!")) {

            peopleCount = Integer.parseInt(input);
            cinemaCapacity -= peopleCount;
            if (cinemaCapacity < 0) {
                break;
            }
            if (peopleCount % 3 == 0) {
                totalSum += (peopleCount * pricePerTicket) - 5;
            } else {
                totalSum += peopleCount * pricePerTicket;

            }
            input=scanner.nextLine();
        }


            if (cinemaCapacity > 0 || cinemaCapacity == 0) {
                System.out.printf("There are %d seats left in the cinema.\n", cinemaCapacity);
            } else {
                System.out.printf("The cinema is full.\n");

            }
            System.out.printf("Cinema income - %d lv.", totalSum);


        }
    }
