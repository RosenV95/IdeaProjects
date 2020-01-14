package com.valkov;

import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int stepsWalked=0;
        int stepsGoal=10000;
        while (stepsWalked<stepsGoal) {
            String input = scanner.nextLine();
            if (input.equals("Going home")) {
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                stepsWalked += stepsToHome;
                break;
            }
            int currentStepsWalked = Integer.parseInt(input);
            stepsWalked += currentStepsWalked;
        }

        if(stepsWalked>=stepsGoal){
                System.out.println("Goal reached! Good job!");


        }else {
                System.out.printf("%d more steps to reach goal.", stepsGoal-stepsWalked);
            }

        }

    }

