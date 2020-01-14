package com.valkov;

public class Main {

    public static void main(String[] args) {
	Burger burger=new Burger("White", "Beef",1.90);
	burger.getBasePrice();
	burger.addKetchup(0.20);
	burger.addCheese(0.60);
	burger.addLettuce(0.30);
	burger.getAdditionsPrice();
	burger.TotalPrice();
	burger.addOnions(0.2);
	burger.TotalPrice();

	HealthyBurger healthyBurger=new HealthyBurger("Chicken",2.50);
	healthyBurger.getBasePrice();
	healthyBurger.addKetchup(0.20);
	healthyBurger.addAvocado(1.00);
	healthyBurger.addCucumber(0.80);
	healthyBurger.getAdditionsPrice();
	healthyBurger.TotalPrice();

	Deluxe deluxeburger=new Deluxe("Wholegrain", "Pulled Pork", 3.00);
	deluxeburger.getBasePrice();
	deluxeburger.getAdditionsPrice();
	deluxeburger.TotalPrice();
	deluxeburger.addLettuce(0.50);
	//"Cannot have additions on the Deluxe burger"

	deluxeburger.addCheese(0.50);
	//"Cannot have additions on the Deluxe burger"
	deluxeburger.TotalPrice();



	    }
}
