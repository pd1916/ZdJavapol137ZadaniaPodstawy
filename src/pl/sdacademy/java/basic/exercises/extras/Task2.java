package pl.sdacademy.java.basic.exercises.extras;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First char: ");
        char firstChar = scanner.next().charAt(0);
        System.out.print("Second char: ");
        char secondChar = scanner.next().charAt(0);
        System.out.println("Distance: " + getDistanceBetweenChars(firstChar, secondChar));
    }

    private static int getDistanceBetweenChars(char firstChar, char secondChar) {
        // tutaj możemy wykorzystać metodę abs z klasy Math, oraz metody z klasy Character do zamieniania charów na małe litery
        return Math.abs(Character.toLowerCase(secondChar) - Character.toLowerCase(firstChar));
    }
}
