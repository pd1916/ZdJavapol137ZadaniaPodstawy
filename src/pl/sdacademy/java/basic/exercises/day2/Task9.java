package pl.sdacademy.java.basic.exercises.day2;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        String longestWord = null;
        int lengthOfTheLongestWord = 0;

        //#1 option
        do {
            System.out.print("Please insert your text: ");
            input = scanner.nextLine();
            if(input.isBlank()) {
                System.out.println("No input");
            } else if(!"Enough".equals(input)) {
                if(lengthOfTheLongestWord < input.length()) {
                    longestWord = input;
                    lengthOfTheLongestWord = input.length();
                }
            }
        } while(!"Enough".equals(input));

        //#2 option
        /*while(true) {
            System.out.print("Please insert your text: ");
            input = scanner.nextLine();
            if(input.isBlank()) {
                System.out.println("No input");
            } else if("Enough".equals(input)) {
                break;
            } else {
                if (lengthOfTheLongestWord < input.length()) {
                    longestWord = input;
                    lengthOfTheLongestWord = input.length();
                }
            }
        }*/
        System.out.println(longestWord);
    }
}