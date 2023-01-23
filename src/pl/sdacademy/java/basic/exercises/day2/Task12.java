package pl.sdacademy.java.basic.exercises.day2;

import java.util.Scanner;

public class Task12 {

    private static final int VALUE_LOWER_A_IN_ASCII = 97;
    private static final int VALUE_LOWER_Z_IN_ASCII = 122;
    private static final int DIFF_A_AND_Z_LETTER = 26;

    public static void main(String[] args) {
        System.out.print("Please insert your text: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.print("Please insert shift: ");
        int shift = scanner.nextInt();
        String encryptedText = encryptText(input, shift);
        System.out.println("Encrypted test: " + encryptedText);
    }

    private static String encryptText(String input, int shift) {
        if(StringValidator.isValid(input) && shift != 0) {
            StringBuilder encryptedSb = new StringBuilder();
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) >= VALUE_LOWER_A_IN_ASCII && input.charAt(i) <= VALUE_LOWER_Z_IN_ASCII) {
                    char c = (char) ((((input.charAt(i) - (VALUE_LOWER_A_IN_ASCII - shift)) % DIFF_A_AND_Z_LETTER) + VALUE_LOWER_A_IN_ASCII));
                    encryptedSb.append(c);
                }
            }
            return encryptedSb.toString();
        }
        return input;
    }
}