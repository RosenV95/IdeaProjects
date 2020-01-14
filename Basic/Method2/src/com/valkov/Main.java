package com.valkov;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int highScore= calculateHighScorePosition(1500);
                displayHighScorePosition("Pablo", calculateHighScorePosition(1500));
                highScore=calculateHighScorePosition(900);
                displayHighScorePosition("Max", calculateHighScorePosition(900));
                highScore=calculateHighScorePosition(400);
                displayHighScorePosition("Emma", calculateHighScorePosition(400));
                highScore=calculateHighScorePosition(50);
                displayHighScorePosition("Brad", calculateHighScorePosition(50));

    }
    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position);
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore>=1000){
            return 1;
        }
        else if(playerScore>=500){
            return 2;
        }
        else if(playerScore>=100){
            return 3;

        }
        else{
            return 4;
        }

    }
}
