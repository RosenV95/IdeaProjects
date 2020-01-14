package com.valkov;

public class Main {

    public static void main(String[] args) {
        Point first = new Point(10, 5);
        Point second = new Point(5, 3);
        if(first.distance()>5){
            System.out.println("The distance is too big");
        }
        System.out.println("distance/diagonal(0,0 to first)= " + first.distance());
        System.out.println("distance/diagonal(second to first)= " + first.distance(second));
        System.out.println("distance/diagonal(2,2 to first)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
