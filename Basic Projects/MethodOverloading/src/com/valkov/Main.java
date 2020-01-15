package com.valkov;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore=calculateScore("Tim", 500);
        System.out.println("New score is "+newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(6,0);
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+ playerName + " scored " + score + " points");
        return score*1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No name, no score");
        return 0;
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet<0)|| ((inches<0) || (inches > 12))){
            return -1;
        }
            double centimetres=(feet*12)*2.54;
            centimetres+=inches*2.54;
        System.out.println(feet + " feet, "+inches+" inches = " + centimetres+ " cm");
        return centimetres;

    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0){
            return -1;
        }
        else{
            return (inches);
        }
    }
}
