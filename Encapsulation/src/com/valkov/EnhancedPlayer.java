package com.valkov;

public class EnhancedPlayer {
    private String name;
    private int hitPoints =100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        this.weapon = weapon;
        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }
    }

    public void loseHealth(int dmg) {
        this.hitPoints = this.hitPoints - dmg;
        if (this.hitPoints <= 0) {
            System.out.println("Player KO'd");
        }
    }
    public int healthRemaining(){
        return hitPoints;
    }

    public int getHealth() {
        return hitPoints;
    }
}