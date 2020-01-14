package com.valkov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamAPIDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = {"1", "5", "6", "23", "50", "60"};

        List<Integer> numsAsList = Arrays.stream(nums)
                .map(Integer::parseInt)
                //.filter(x-> x < 10)
                .sorted((a,b)->Integer.compare(b,a))
                .map(w->w +2)
             //   .limit(1)//finds the first number
                .collect(Collectors.toList());
        System.out.println(numsAsList);
    }
}
