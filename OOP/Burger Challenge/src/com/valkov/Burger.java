package com.valkov;

public class Burger {
    private String breadType;
    private String meat;
    private double basePrice;
    public double additionsPrice;


    public Burger(String breadType, String meat, double basePrice) {
        this.breadType = breadType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public String getBreadType() {
        System.out.println(breadType);
        return breadType;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        System.out.printf("The base price of this burger is $%.2f\n", basePrice);
        return basePrice;

    }

    public double getAdditionsPrice() {
        System.out.printf("The current price for your additions is $%.2f\n", additionsPrice);
        return additionsPrice;
    }

    public void TotalPrice() {
        double totalPrice = this.additionsPrice + this.basePrice;
        System.out.printf("Total price for your order is $%.2f\n", totalPrice);

    }

    public void addCheese(double cheesePrice) {
        System.out.printf("Cheese has been added for $%.2f\n", cheesePrice);
        this.additionsPrice += cheesePrice;

    }

    public void addLettuce(double lettucePrice) {
        System.out.printf("Lettuce has been added for $%.2f\n", lettucePrice);
        this.additionsPrice += lettucePrice;

    }

    public void addKetchup(double ketchupPrice) {
        System.out.printf("Ketchup has been added for $%.2f\n", ketchupPrice);
        this.additionsPrice += ketchupPrice;
    }
    public void addOnions(double onionsPrice){
        System.out.printf("Onion has been added for $%.2f\n", onionsPrice);
        this.additionsPrice+=onionsPrice;

    }

}

class HealthyBurger extends Burger {

    public HealthyBurger(String meat, double basePrice) {
        super("Brown rye", meat, basePrice);

    }

    public void addAvocado(double avocadoPrice) {
        System.out.printf("Avocado has been added for $%.2f\n", avocadoPrice);
        this.additionsPrice += avocadoPrice;

    }

    public void addCucumber(double cucumberPrice) {
        System.out.printf("Cucumber has been added for $%.2f\n", cucumberPrice);
        this.additionsPrice += cucumberPrice;
    }

    @Override
    public void addCheese(double cheesePrice) {
        super.addCheese(cheesePrice);
    }

    @Override
    public void addLettuce(double lettucePrice) {
        super.addLettuce(lettucePrice);
    }

    @Override
    public void addKetchup(double ketchupPrice) {
        super.addKetchup(ketchupPrice);
    }

    @Override
    public void addOnions(double onionsPrice) {
        super.addOnions(onionsPrice);
    }

    @Override
    public double getBasePrice() {
        return super.getBasePrice();
    }

    @Override
    public void TotalPrice() {
        super.TotalPrice();

    }

}
class  Deluxe extends Burger{
    public Deluxe(String breadType, String meat, double basePrice) {
        super(breadType, meat, basePrice);
        addDrink(1.50);
        addFries(1.20);
    }
    public void addFries(double friesPrice){
        this.additionsPrice+=friesPrice;
        System.out.printf("Fries come with the deluxe burger for the price of $%.2f\n",friesPrice);
    }
    public void addDrink(double drinkPrice){
        this.additionsPrice+=drinkPrice;
        System.out.printf("A drink comes with the deluxe burger at the price of $%.2f\n",drinkPrice);

    }

    @Override
    public void addCheese(double cheesePrice) {
        System.out.println("Cannot have additions on the Deluxe burger");
    }

    @Override
    public void addLettuce(double lettucePrice) {
        System.out.println("Cannot have additions on the Deluxe burger");
    }

    @Override
    public void addKetchup(double ketchupPrice) {
        System.out.println("Cannot have additions on the Deluxe burger");
    }

    @Override
    public void addOnions(double onionsPrice) {
        System.out.println("Cannot have additions on the Deluxe burger");
    }
}