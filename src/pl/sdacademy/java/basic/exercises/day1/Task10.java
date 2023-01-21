package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert digit: ");
        int number = scanner.nextInt();
        System.out.println("Sum Of Digits: " + sumOfDigits(number));
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        //#1 option
        if(number > 9) {
            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }
        } else {
            sum = number;
        }

        //#2 option
        /*if(number > 9) {
            do {
                sum += number % 10;
                number /= 10;
            } while (number != 0);
        } else {
            sum = number;
        }*/

        //#3 option
        /*for (char c : String.valueOf(number).toCharArray()) {
            sum = sum + c - '0';
        }*/
        return sum;
    }
}