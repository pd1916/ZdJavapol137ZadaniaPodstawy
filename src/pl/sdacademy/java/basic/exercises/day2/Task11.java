package pl.sdacademy.java.basic.exercises.day2;

public class Task11 {

    public static void main(String[] args) {
        String input = "kajak";
        System.out.println("Input: " + args[0]);
        System.out.println("Result: " + ifPalindrome(args[0]));

        input = "sda";
        System.out.println("\nInput: " + input);
        System.out.println("Result: " + ifPalindrome(input));
    }

    private static boolean ifPalindrome(String inputString) {
        StringBuilder sbAfterReverse = new StringBuilder(inputString).reverse();
        String stringAfterReverse = sbAfterReverse.toString();
        return stringAfterReverse.equals(inputString);
    }

    private static boolean isPalindrome(String input) {
        if(StringValidator.isValid(input)) {
            int forward = 0;
            int backward = input.length() - 1;
            while(backward > forward) {
                char forwardChar = input.charAt(forward);
                char backwardChar = input.charAt(backward);
                if(forwardChar != backwardChar) {
                    return false;
                }
                forward++;
                backward--;
            }
            return true;
        }
        return false;
    }
}