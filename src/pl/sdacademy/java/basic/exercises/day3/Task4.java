package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    private static final String REGEX_V1 = "a+ psik";
    private static final String REGEX_V2 = "a+ (psik|Psik)";

    public static void main(String[] args) {
        System.out.println(isContainsAString("a Psik"));
        System.out.println(isContainsAString("a psik"));
        System.out.println(isContainsAString("aaa psik"));
        System.out.println(isContainsAString("aaapsik"));
        System.out.println(isContainsAString("psik"));
        System.out.println(isContainsAString(" psik"));
    }

    private static boolean isContainsAString(String input) {
        Pattern pattern = Pattern.compile(REGEX_V1);
        return pattern.matcher(input).matches();
    }
}
