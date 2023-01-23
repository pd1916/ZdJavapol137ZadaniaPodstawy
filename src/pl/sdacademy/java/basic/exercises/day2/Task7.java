package pl.sdacademy.java.basic.exercises.day2;

public class Task7 {

    private static final char SPACE_SIGN = ' ';

    public static void main(String[] args) {
        String input = "Ala ma kota";
        System.out.println("Input: " + input);
        System.out.println("Result: " + calculatePercentOfSpacesInString(input));

        input = "Ala";
        System.out.println("\nInput: " + input);
        System.out.println("Result: " + calculatePercentOfSpacesInString(input));

        input = " ";
        System.out.println("\nInput: " + input);
        System.out.println("Result: " + calculatePercentOfSpacesInString(input));
    }

    private static double calculatePercentOfSpacesInString(String input) {
        if(StringValidator.isValid(input) && input.contains(String.valueOf(SPACE_SIGN))) {
            double spacesCounter = 0;
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == SPACE_SIGN) {
                    spacesCounter++;
                }
            }
            return (spacesCounter / input.length()) * 100;
        }
        return 0;
    }
}