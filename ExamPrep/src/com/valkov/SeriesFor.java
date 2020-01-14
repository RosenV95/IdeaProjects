package com.valkov;

import java.util.Scanner;

public class SeriesFor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        int seriesCount=Integer.parseInt(scanner.nextLine());
        for(int i=1; i<=seriesCount;i++){
            String seriesName=scanner.nextLine();
            double seriesPrice=Double.parseDouble(scanner.nextLine());

            if(seriesName.equals("Thrones")){
                seriesPrice=seriesPrice-(seriesPrice*0.50);


            }
            else if(seriesName.equals("Lucifer")){
                seriesPrice=seriesPrice-(seriesPrice*0.40);

            }
            else if(seriesName.equals("Protector")){
                seriesPrice=seriesPrice-(seriesPrice*0.30);

            }
            else if(seriesName.equals("TotalDrama")){
                seriesPrice=seriesPrice-(seriesPrice*0.20);
            }
            else if(seriesName.equals("Area")){
                seriesPrice=seriesPrice-(seriesPrice*0.10);

            }
            budget-=seriesPrice;


            if(budget<0){
                break;
            }


        }
        if(budget>=0){
            System.out.printf("You bought all the series and left with %.2f lv.",budget);

        }else{
            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(budget));
        }

        }
    }

