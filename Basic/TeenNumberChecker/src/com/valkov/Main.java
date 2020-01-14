package com.valkov;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public static boolean hasTeen(int parameter1, int parameter2, int parameter3) {
        if (parameter1 >= 13 && parameter1 <= 19) {
            return true;
        }
        if (parameter2 >= 13 && parameter2 <= 19) {
            return true;
        }
        if (parameter3 >= 13 && parameter3 <= 19) {
            return true;
        } else return false;
    }

    public static boolean isTeen(int checker1) {
        if (checker1 >= 13 && checker1 <= 19) {
            return true;
        } else return false;
    }

}
