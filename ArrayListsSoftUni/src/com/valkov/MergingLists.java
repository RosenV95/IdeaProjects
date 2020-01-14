package com.valkov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> firstNumber= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondNumber= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int minLenght=Math.min(firstNumber.size(),secondNumber.size());
        List<Integer> resultList=new ArrayList<>();
        for(int i=0;i<minLenght;i++){
            resultList.add(firstNumber.get(i));
            resultList.add(secondNumber.get(i));

        }
        if(firstNumber.size()>secondNumber.size()){
            resultList.addAll(firstNumber.subList(minLenght,firstNumber.size()));
        }else {
            resultList.addAll(secondNumber.subList(minLenght,secondNumber.size()));
        }
        System.out.println(resultList.toString().replaceAll("\\[|,|\\]",""));
    }
}
