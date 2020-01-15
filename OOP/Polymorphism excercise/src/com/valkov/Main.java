package com.valkov;

public class Main {

    public static void main(String[] args) {

       Car car=new Car(4, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mercedes mercedes=new Mercedes(4, "Mercedes S class");

        System.out.println(mercedes.startEngine());
        System.out.println(mercedes.accelerate());
        System.out.println(mercedes.brake());


        Ford ford=new Ford(4, "Ford Escort");

        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());


        Peugot peugot=new Peugot(4, "3008");

        System.out.println(peugot.startEngine());
        System.out.println(peugot.accelerate());
        System.out.println(peugot.brake());
    }
}
