package com.valkov;



public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    public Dog(int size, int weight, String name,int eyes,int legs,int tail, int teeth, String coat) {
        super(1, 1, size, weight, name);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }
    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
    private void smell(){
        System.out.println("Dog.smell called");
    }

    @Override
    public void sense() {
        System.out.println("Dog.sense called");
        smell();
        super.sense();
    }
    public void walk(){
        System.out.println("Dog.walk called");
        move(5);
    }
    public void run(){
        System.out.println("Dog.run called");
        move(10);
    }
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move called");
         moveLegs(speed);
        super.move(5);
    }
}
