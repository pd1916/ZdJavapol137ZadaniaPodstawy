package pl.sdacademy.java.basic.exercises.day2;

import static pl.sdacademy.java.basic.exercises.day2.StringValidator.isValid;

public class Task6 {

    public static void main(String[] args) {
        String input = "Ala ma kota";
        char searchedChar = 'a';
        System.out.println("Result: " + getIndex(input, searchedChar));

        input = "Ala ma kota";
        searchedChar = 'z';
        System.out.println("Result: " + getIndex(input, searchedChar));
    }

    private static int getIndex(String input, char searchedChar) {
        if(isValid(input)) {
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == searchedChar) {
                    return i;
                }
            }
        }
        return -1;
    }
}
