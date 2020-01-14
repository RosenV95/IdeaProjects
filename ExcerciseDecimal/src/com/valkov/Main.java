package com.valkov;

public class Main {

    public static void main(String[] args) {
        double a=3.1748;
        double b=3.17486;
        a=a*10000;
        b=b*10000;
        double a1=a;
        System.out.println(a1);
        double a2=b;
        System.out.println(a2);
//        *this is an example why it wouldn't work with a double, as it adds decimals to the whole number that is
//        multiplied by 1000 which messes up the caluclation

        if((areEqualByThreeDecimalPlaces(3.1755,3.1757))==true)
            System.out.println("It works");
        else{
            System.out.println("It doesn't work");
        }
    }
    public static boolean areEqualByThreeDecimalPlaces(double input1, double input2){
        input1=input1*1000;
        input2=input2*1000;

        int newInput1=(int)input1;
        int newInput2=(int)input2;

        if(newInput1==newInput2){
            return true;

        }
        else return false;
    }
}
