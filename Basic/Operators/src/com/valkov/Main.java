package com.valkov;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1 + 2;
        System.out.println(result);
        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 =" + result);
        previousResult = result;
        result = result*10;
        System.out.println(previousResult + " *10 = " + result);
        previousResult = result;
        result = result/5;
        System.out.println(previousResult + " /5 = " + result);
        previousResult = result;
        result = result%3;
        System.out.println(previousResult + " %3 =" +result);
        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);


        result--;

        System.out.println("Result is now " + result);
        result +=2;
        //this is equal to result+2
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -=10;
        System.out.println("Result is now " + result);
        result/=10;
        System.out.println("Result is now " + result);


        boolean isAlien = false;
        if(isAlien == false)
            System.out.println("it's not an alien");
         int topScore = 100;
         if(topScore == 100)
             System.out.println("You gotta high score");

         int secondHighScore=110;
                 if(( topScore > secondHighScore) && (topScore<110))
                     System.out.println("The if is correct");
                if(topScore > 100 || secondHighScore <= 90)
        System.out.println("one of these is true");
                int newValue = 50;
                if(newValue==50);
        System.out.println("test");
        boolean isCar = false;
        if(isCar == true)
        System.out.println("test2");
        isCar=true;
        boolean wasCar = isCar ? true : false;
        System.out.println("wasCar is true");


        double number1 = 20;
        double number2 = 80;
        double sum1 = (number1+number2) * 25;
        System.out.println("sum1 = "+sum1);
        double remainder1 = sum1%40;
        System.out.println("remainder 1 = "+remainder1);
        if(remainder1<=20)
            System.out.println("Total was over the limit");

    }
}
