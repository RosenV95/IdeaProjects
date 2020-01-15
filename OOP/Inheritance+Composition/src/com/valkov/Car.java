package com.valkov;

public class Car extends Vehicle {
    private String drivetrain;
    private Chasis newChasis;
    private Interior newInterior;
    private Engine newEngine;

    public Car(String manufacturer, String drivetrain, Chasis newChasis, Interior newInterior, Engine newEngine) {
        super(manufacturer);
        this.drivetrain = drivetrain;
        this.newChasis = newChasis;
        this.newInterior = newInterior;
        this.newEngine = newEngine;
    }
    public void startUp(){
        newEngine.engineStart();
    }
}
