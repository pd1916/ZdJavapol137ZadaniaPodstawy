package pl.sdacademy.java.basic.exercises.day2;

import static pl.sdacademy.java.basic.exercises.day2.StringValidator.isValid;

public class Task4 {
    private static final String REPLACEMENT = "-STOP-";

    public static void main(String[] args) {
        String input = "Ala ma, kota. kot, ma Ale";
        System.out.println(replaceString(input));
        input = null;
        System.out.println(replaceString(input));
    }

    private static String replaceString(String input) {
        if(isValid(input)) {
            return input
                    .replace(".", REPLACEMENT)
                    .replace(",", REPLACEMENT);
        }
        return input;
    }
}
