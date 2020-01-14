package com.valkov;

public class Car {
    private int cylinders;
    private String name;
    private int wheels;
    private boolean engine;


    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;

    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public String startEngine() {
       return "Engine has been started";
    }

    public String accelerate() {
        return "Car is accelerating";
    }

    public String brake() {
        return "Car is braking";
    }
}
    class Mercedes extends Car{
        public Mercedes(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Mercedes has started";
        }

        @Override
        public String accelerate() {
            return "Mercedes is accelerating";
        }

        @Override
        public String brake() {
            return "Mercedes is braking";
        }
    }
class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford has started";
    }

    @Override
    public String accelerate() {
        return "Ford is accelerating";
    }

    @Override
    public String brake() {
        return "Ford is braking";
    }
}

class Peugot extends Car{
    public Peugot(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+ " has started";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+ " is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+" is braking";
    }
}