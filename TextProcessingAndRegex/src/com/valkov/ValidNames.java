package com.valkov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidNames {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        String[] input=text.split(", ");
        Pattern pattern=Pattern.compile("^(?i)[a-z0-9-_]{3,16}$");
        List<String> validNames = new ArrayList<>();
        for (String name:input) {
            Matcher matcher=pattern.matcher(name);
            boolean hasMatch= matcher.find();
            if(hasMatch){

                String matchName=matcher.group();
                validNames.add(matchName);

            }

        }
        System.out.println(validNames);
    }
}


