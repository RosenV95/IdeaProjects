package com.valkov;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();
        String[] numbers=input.split("\\s+");

        List<Double> doubleList= new ArrayList<>();
        for(String number:numbers){
            doubleList.add(Double.parseDouble(number));
        }

        for(int i=0;i<doubleList.size()-1;i++){
            double firstNumber=doubleList.get(i);
            double secondNumber=doubleList.get(i+1);
            if(firstNumber==secondNumber){
                double sum=firstNumber+secondNumber;
                doubleList.set(i, sum);//sets the i index is equal to the sum itself plus its neighboring index.
                doubleList.remove(i+1);//removes the index that was summed above
                i=-1;//sets to -1 so we can always start at the beginning of the list
            }

        }
        System.out.println(concatListElements(doubleList));

    }
    static String concatListElements(List<Double> list){
        DecimalFormat format=new DecimalFormat("#.###");
        String output="";
        for(Double num:list ){
            output+=format.format(num)+ " ";

        }
        return output.trim();
    }
}
