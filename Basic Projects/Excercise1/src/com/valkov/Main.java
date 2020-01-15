package com.valkov;

public class Main {

    public static void main(String[] args) {
	// write your code here
        if(toMilesPerHour())
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
        else{
            double mph= kilometersPerHour/1.609;
            long rounded=Math.round(mph);
            return rounded;
        }

    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour)+ " mi/h");
        }

    }

}
