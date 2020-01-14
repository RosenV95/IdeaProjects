package com.valkov;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String text="Rosen Valkov, Stamata Valkov, Rosen  Georgiev";
        String[] input=text.split(", ");
        List<String> validResults=new ArrayList<>();
        Pattern patter=Pattern.compile("^[A-Z][a-z]+ [A-Z][a-z]+$");
        for (String name:input) {
            Matcher matcher=patter.matcher(name);
           boolean hasMatch= matcher.find();
           if(hasMatch){

               String matchName=matcher.group();
               validResults.add(matchName);

           }

        }
        System.out.println(validResults);
    }
}
