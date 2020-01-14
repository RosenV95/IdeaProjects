package com.valkov;

public class Interior {
    private int seatCount;
    private Fabric newFabric;

    public Interior(int seatCount, Fabric newFabric) {
        this.seatCount = seatCount;
        this.newFabric = newFabric;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public Fabric getNewFabric() {
        return newFabric;
    }
    public void startIgnition(){
        System.out.println("Car started");
    }
}
