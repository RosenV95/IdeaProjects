package com.valkov;

public class Engine {
    private String fuelType;
    private String material;
    private Displacement newDisplacement;

    public Engine(String fuelType, String material, Displacement newDisplacement) {
        this.fuelType = fuelType;
        this.material = material;
        this.newDisplacement = newDisplacement;
    }
    public void engineStart(){
        System.out.println("Engine is up and running");
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getMaterial() {
        return material;
    }

    public Displacement getNewDisplacement() {
        return newDisplacement;
    }
}
