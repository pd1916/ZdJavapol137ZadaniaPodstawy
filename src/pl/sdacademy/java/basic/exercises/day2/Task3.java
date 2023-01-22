package pl.sdacademy.java.basic.exercises.day2;

import static pl.sdacademy.java.basic.exercises.day2.StringValidator.isValid;

public class Task3 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        String word = "ma";
        System.out.println("Input: " + input);
        System.out.println("Word: " + word);
        System.out.println("Result: " + getIndex(input, word));

        input = "Ala ma kota";
        word = null;
        System.out.println("Input: " + input);
        System.out.println("Word: " + word);
        System.out.println("Result: " + getIndex(input, word));
    }

    private static int getIndex(String input, String word) {
        if(isValid(input) && isValid(word)) {
//            if(input.contains(word)) {
//                return input.indexOf(word);
//            } else {
//                return -1;
//            }
            // warunek ? operacja_gdy_warunek_true : operacja_gdy_warunek_false
            //return input.contains(word) ? input.indexOf(word) : -1;
            return input.indexOf(word);
        }
        return -1;
    }
}
