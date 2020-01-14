package com.valkov;

public class Chasis {
    private String material;
    private String color;
    private Dimensions newDimensions;

    public Chasis(String material, String color, Dimensions newDimensions) {
        this.material = material;
        this.color = color;
        this.newDimensions = newDimensions;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public Dimensions getNewDimensions() {
        return newDimensions;
    }
}
