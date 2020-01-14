package com.valkov;

public class Main {

    public static void main(String[] args) {
	getDurationString(60, 20);
        System.out.println(getDurationString(65,50));
        System.out.println(getDurationString(359));
    }
    public static String getDurationString(int minutes, int seconds){
        if((minutes < 0)||(seconds<0) || (seconds>59)){
            return "Invalid Value";
        }
        else{
            int hours=(minutes/60);
            int minutes2=(minutes%60);

            return hours + "h" + minutes2 + "m" + seconds +"s";

        }
    }
    public static String getDurationString(int seconds){
        if(seconds<0){
            return "Invalid Value";
        }
        else{
            int minutes=seconds/60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);

        }
    }


}
