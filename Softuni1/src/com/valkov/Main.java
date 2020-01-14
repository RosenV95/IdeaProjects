package com.valkov;

import static java.lang.Math.PI;

public class Main {

    public static void main(String[] args) {

        area(5);
        area(5,5);
    }
    public static double area(double radius){
        if(radius<0){
            return -1.0;
        }
        else{
            System.out.println(radius*radius*PI);
            return radius*radius*PI;

        }
    }
    public static double area(double x, double y){
        if((y<0) || (x<0)){
            return -1.0;
        }
        else{
            System.out.println(x*y);
            return x*y;
        }
    }

}
