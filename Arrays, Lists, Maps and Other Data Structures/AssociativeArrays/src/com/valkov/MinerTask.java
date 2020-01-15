package com.valkov;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 ="";
        int input2=0;

        Map<String, Integer> myMap = new HashMap<>();
        while(!"stop".equals(input1=scanner.nextLine())) {
            String resource=input1;
            input2 = Integer.parseInt(scanner.nextLine());
            if(!myMap.containsKey(resource)){
                myMap.put(resource,input2);
            }else {
                myMap.merge(resource, input2, (x, y) -> x + y);
            }



        }


        myMap.entrySet().forEach(e->{
            System.out.println(String.format("%s -> %d", e.getKey(),e.getValue()));
        });


    }

}
