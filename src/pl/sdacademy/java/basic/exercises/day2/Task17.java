package pl.sdacademy.java.basic.exercises.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {
        int[] xDigitFromUser = getXDigitFromUser(10);
        int[] ints = sortArray(xDigitFromUser);
        System.out.println("Result: " + Arrays.toString(ints));
    }

    private static int[] getXDigitFromUser(int x) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[x];
        int counter = 0;
        while(counter < 10) {
            System.out.print("Insert digit: ");
            int i = scanner.nextInt();
            array[counter] = i;
            counter++;
        }
        return array;
    }

    private static int[] sortArray(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int tempValue = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempValue;
                }
            }
        }
        return array;
    }
}