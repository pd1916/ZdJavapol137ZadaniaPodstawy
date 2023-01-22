package pl.sdacademy.java.basic.exercises.day2;

import static pl.sdacademy.java.basic.exercises.day2.StringValidator.isValid;

public class Task2 {
    public static void main(String[] args) {
        String input = "programowanie";
        String prefix = "pro";
        System.out.println("Input: " + input);
        System.out.println("Prefix: " + prefix);
        System.out.println("Result " + isPrefix(input, prefix));

        input = "programowanie";
        prefix = "abc";
        System.out.println("Input: " + input);
        System.out.println("Prefix: " + prefix);
        System.out.println("Result " + isPrefix(input, prefix));

        input = "programowanie";
        prefix = "Pro";
        System.out.println("Input: " + input);
        System.out.println("Prefix: " + prefix);
        System.out.println("Result " + isPrefix(input, prefix));

        input = null;
        prefix = "abc";
        System.out.println("Input: " + input);
        System.out.println("Prefix: " + prefix);
        System.out.println("Result " + isPrefix(input, prefix));

        input = "programowanie";
        prefix = null;
        System.out.println("Input: " + input);
        System.out.println("Prefix: " + prefix);
        System.out.println("Result " + isPrefix(input, prefix));
    }

    private static boolean isPrefix(String input, String prefix) {
        if(isValid(input) && isValid(prefix)) {
            return input.startsWith(prefix);
        }
        return false;
    }
}
