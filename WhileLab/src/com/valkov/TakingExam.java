package com.valkov;

import java.util.Scanner;

public class TakingExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poorGradesAllowed = Integer.parseInt(scanner.nextLine());
        String problemName = scanner.nextLine();
        int poorGradesCount = 0;
        int sumGrades=0;
        int solvedCount=0;
        String lastProblemName="";

        while (!problemName.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            sumGrades+=grade;
            solvedCount++;
            if (grade <= 4) {
                poorGradesCount++;
            }
            if (poorGradesCount == poorGradesAllowed) {
                System.out.printf("You need a break! %d poor grades", poorGradesCount);
                break;

            }
            lastProblemName=problemName;
            problemName=scanner.nextLine();
        }
        if(problemName.equals("Enough")){
            double average=sumGrades*1.0/solvedCount;
            System.out.printf("Average score: %.2f%n",average);
            System.out.printf("Number of problems: %d%n",solvedCount);
            System.out.printf("Last problem: %s",lastProblemName);

        }

    }
}