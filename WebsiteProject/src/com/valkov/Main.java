package com.valkov;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String occupation=scanner.nextLine();
	if(occupation.equals("Teacher")){
        System.out.println("Welcome to the Teacher's panel, select an option from the menu:\n 1.Create Subject\n 2.Create Course\n 3.Add Materials\n 4.View Homework");
        int input=Integer.parseInt(scanner.nextLine());
        if(input==1){
            System.out.println("Select the name of the subject: ");
            String subjectName=scanner.nextLine();
            System.out.println("Subject " + subjectName+ " has been created!.");
        }
        if(input==2){
            System.out.println("Select the subject of the course:\n Select maximum amount of students:\n Select date of entry:\n Add Description:");
            String courseSubject=scanner.nextLine();
            int maxStudents=Integer.parseInt(scanner.nextLine());
            String dateOfEntry=scanner.nextLine();
            String description=scanner.nextLine();
            System.out.println("You created a course for "+courseSubject+".\n The maximum amount of students are "+maxStudents+".\n Entries can begin on "+dateOfEntry+".\n Course description: "+description);
        }
        if(input==3){
            System.out.println("Upload your materials:");

        }
        if(input==4){
            System.out.println("You're now viewing the homework.");

        }
    }if(occupation.equals("Student")){
            System.out.println("Welcome to the Student's panel, select an option from the menu:\n 1.View Courses\n 2.Enroll in a Course\n 3.View course materials\n 4.Upload homework");
            int input=Integer.parseInt(scanner.nextLine());
            if(input==1){
                System.out.println("You are now viewing available courses");


            }
            if (input == 2) {
                System.out.println("Select the subject of the course you wish to enroll for:");
                String courseName=scanner.nextLine();
                System.out.println("Congratulations, you have enrolled in a " +courseName+" course.");
            }
            if (input==3){
                System.out.println("You're now viewing materials for courses you're enrolled in");
            }
            if (input==4){
                System.out.println("Upload yor homework");

            }
        }
    }
}
