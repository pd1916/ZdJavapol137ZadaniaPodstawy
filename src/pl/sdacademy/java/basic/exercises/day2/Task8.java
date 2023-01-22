package pl.sdacademy.java.basic.exercises.day2;

import static pl.sdacademy.java.basic.exercises.day2.StringValidator.isValid;

public class Task8 {
    private static final int VALUE_UPPER_A_IN_ASCII = 65;
    private static final int VALUE_UPPER_Z_IN_ASCII = 90;
    private static final int VALUE_LOWER_A_IN_ASCII = 97;
    private static final int VALUE_LOWER_Z_IN_ASCII = 122;
    private static final int DIFF_UPPER_AND_LOWER_IN_ASCII = 32;

    public static void main(String[] args) {
        String input = "Ala mA kOtA i 5 pSoW!";
        System.out.println("Result: " + replaceChars(input));
//        String input = "Pen";
//        input = input.concat(" Box");
//        System.out.println(input);
//
//        StringBuilder sb = new StringBuilder("Pen");
//        sb.append(" Box");
//        System.out.println(sb);
    }

    private static String replaceChars(String input) {
        if(isValid(input)) {
            //String result = "";
            StringBuilder result = new StringBuilder();
            for(int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if(currentChar >= VALUE_UPPER_A_IN_ASCII && currentChar <= VALUE_UPPER_Z_IN_ASCII) {
                    //mamy wielką literę, zamieniamy na małą
                    //result += (char)(currentChar + DIFF_UPPER_AND_LOWER_IN_ASCII);
                    result.append((char)(currentChar + DIFF_UPPER_AND_LOWER_IN_ASCII));
                } else if(currentChar >= VALUE_LOWER_A_IN_ASCII && currentChar <= VALUE_LOWER_Z_IN_ASCII) {
                    //mamy małą literę, zamieniamy na wielką
                    //result += (char)(currentChar - DIFF_UPPER_AND_LOWER_IN_ASCII);
                    result.append((char)(currentChar - DIFF_UPPER_AND_LOWER_IN_ASCII));
                } else {
                    //mamy inny znak niż litery, nic nie modyfikujemy
                    //result += currentChar;
                    result.append(currentChar);
                }
            }
            return result.toString();
        }
        return input;
    }
}
