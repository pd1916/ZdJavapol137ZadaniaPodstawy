package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Pattern;

public class Task3 {
    //private static final String NUMBER_REGEX = "-?[0-9]+(,[0-9]+)?";
    private static final String DIGIT_REGEX = "-?\\d+(,\\d+)?";

    public static void main(String[] args) {
        String input = "1234,1234";
        System.out.println("If digit " + input + " has correct format: " + isCorrectFormat(input));

        input = "1234,1234";
        System.out.println("If digit " + input + " has correct format: " + isCorrectFormat(input));

        input = "-1234,1234";
        System.out.println("If digit " + input + " has correct format: " + isCorrectFormat(input));

        input = "123a123";
        System.out.println("If digit " + input + " has correct format: " + isCorrectFormat(input));

        input = "-10";
        System.out.println("If digit " + input + " has correct format: " + isCorrectFormat(input));

        input = "123,";
        System.out.println("If digit " + input + " has correct format: " + isCorrectFormat(input));
    }

    private static boolean isCorrectFormat(String input) {
        Pattern pattern = Pattern.compile(DIGIT_REGEX);
        return pattern.matcher(input).matches();
    }
}