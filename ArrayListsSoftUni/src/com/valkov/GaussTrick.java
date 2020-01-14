package com.valkov;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> integerList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int initialSize=integerList.size()/2;
        for(int i=0;i<initialSize;i++){
            int firstNum=integerList.get(i);
            int index=(integerList.size()-1);//last index
            int nextNum=integerList.get(index);

            integerList.set(i,firstNum+nextNum);//sets the first index to the sum of the first and the last;
            integerList.remove(index);//removes the last index

            }
        System.out.println(integerList.toString().replaceAll("\\[|,|\\]",""));
        }
    }

