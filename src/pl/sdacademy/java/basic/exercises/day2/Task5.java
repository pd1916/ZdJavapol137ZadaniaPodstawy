package pl.sdacademy.java.basic.exercises.day2;

import static pl.sdacademy.java.basic.exercises.day2.StringValidator.*;

public class Task5 {

    public static void main(String[] args) {
        String input = "Ala ma kota";
        char searchedChar = 'a';
        System.out.println("Result: " + countCharInString(input, searchedChar));

        input = null;
        searchedChar = 'a';
        System.out.println("Result: " + countCharInString(input, searchedChar));
    }

    private static int countCharInString(String input, char searchedChar) {
        int counter = 0;
        if(isValid(input)) {
            for(int i = input.indexOf(searchedChar); i < input.length(); i++) {
                if(input.charAt(i) == searchedChar) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
