package com.valkov;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String dates=scanner.nextLine();
        Pattern pattern=Pattern.compile("^[A-Z]:\\\\(?i)[A-Za-z]+\\\\(?i)[A-Za-z-]+\\\\(?<filename>(?i)[A-Za-z-]+)\\.(?<extension>[a-z]+)$");
        Matcher matcher=pattern.matcher(dates);
        while(matcher.find()){
            System.out.println(String.format("File name:%s, File extension:%s",matcher.group("filename"),
                    matcher.group("extension")));
        }

    }
}

