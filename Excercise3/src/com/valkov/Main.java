package com.valkov;

public class Main {
    public static void main(String[] args) {
    }

    public static boolean shouldWakeUp(boolean ifBarking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        else if((hourOfDay < 8 || hourOfDay > 22) && ifBarking==true){
            return true;

        }
        else return false;
    }
}


