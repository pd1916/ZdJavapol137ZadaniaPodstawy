package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task7 {
    private static final String STOP_DECISION = "Stop";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String decision;
        do {
            System.out.print("Please insert first digit: ");
            float firstDigit = input.nextFloat();
            input.nextLine();

            System.out.print("Please insert operator (+ - / *): ");
            String operator = input.nextLine();

            System.out.print("Please insert second digit: ");
            float secondDigit = input.nextFloat();
            input.nextLine();

            if(isCorrectOperator(operator)) {
                float result = calculate(firstDigit, secondDigit, operator);
                System.out.println("Result: " + firstDigit + operator + secondDigit + " = " + result);
            } else {
                System.out.println("Incorrect operator");
                //System.exit(1); // żeby zakończyć program
            }
            System.out.print("New calculation or Stop? ");
            decision = input.nextLine();
        } while(!STOP_DECISION.equalsIgnoreCase(decision));
    }

    private static boolean isCorrectOperator(String action) {
        Pattern pattern = Pattern.compile("[+-/*]");
        return pattern.matcher(action).matches();
    }

    private static float calculate(float firstDigit, float secondDigit, String operator) {
        float result = 0;
        switch(operator) {
            case "+":
                result = firstDigit + secondDigit;
                break;
            case "-":
                result = firstDigit - secondDigit;
                break;
            case "/":
                if(secondDigit == 0) {
                    System.out.println("Wrong operation");
                    System.exit(1); // żeby zakończyć program
                } else {
                    result = firstDigit / secondDigit;
                }
                break;
            case "*":
                result = firstDigit * secondDigit;
                break;
        }
        return result;
    }
}