package com.valkov;

import java.util.Scanner;

public class OscarsFor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String actorName=scanner.nextLine();
        double academyPoints=Double.parseDouble(scanner.nextLine());
        int judgesCount=Integer.parseInt(scanner.nextLine());
        double pointSum=0;
        double pointsReceived=0;
        double finalSum=0;
        for(int i=1;i<=judgesCount;i++){
            String judgeName=scanner.nextLine();
            double pointsGiven=Double.parseDouble(scanner.nextLine());
            pointsReceived=(pointsGiven*judgeName.length())/2;


            pointSum+=pointsReceived;
            finalSum=pointSum+academyPoints;


            if(finalSum>=1250.5){
                break;
            }
        }
        if((finalSum)<1250.5){
            System.out.printf("Sorry, %s you need %.1f more!",actorName,1250.5-(finalSum));
        }else{
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actorName,(finalSum));
        }
    }
}
