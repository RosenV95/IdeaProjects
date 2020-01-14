package com.valkov;

public class Main {

    public static void main(String[] args) {
	Dimensions dimensions=new Dimensions(200, 299 , 100);
	Displacement newDisplacement= new Displacement(2000);
	Fabric newFabric=new Fabric("Leather");
	Engine newEngine=new Engine("Diesel", "Iron", newDisplacement);
	Interior newInterior=new Interior(5,newFabric);
	Chasis newChasis=new Chasis("Aluminum", "Blue", dimensions);
	Car newCar=new Car("Skoda","4WD", newChasis, newInterior, newEngine);
    newCar.startUp();
    }
}
