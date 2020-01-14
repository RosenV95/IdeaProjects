package com.valkov;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b");
        List<String> validResults = new ArrayList<>();
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            validResults.add(matcher.group());

        }
        System.out.println(String.join(", ", validResults));

    }
}

