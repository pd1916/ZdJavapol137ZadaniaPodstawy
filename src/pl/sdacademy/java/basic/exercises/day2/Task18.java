package pl.sdacademy.java.basic.exercises.day2;

import java.util.Arrays;
import java.util.Random;

public class Task18 {

    public static void main(String[] args) {
        int[] ints = generateArray();
        System.out.println("Input: " + Arrays.toString(ints));
        int[] fun = getDigitsRepeats(ints);
        for(int i = 0; i < fun.length; i++) {
            System.out.println(i + ": " + fun[i]);
        }
    }

    private static int[] generateArray() {
        int[] array = new int[10];
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            //array[i] = random.nextInt(10) + 1; // dla przypadku gdy liczby mają być z zakresu 0-10
            array[i] = random.nextInt(10);
        }
        return array;
    }

    private static int[] getDigitsRepeats(int[] array) {
        //int[] repeats = new int[11]; // dla przypadku gdy liczby mają być z zakresu 0-10
        int[] repeats = new int[10];
        for(int i = 0; i < array.length; i++) {
            repeats[array[i]]++;
            System.out.printf("");
        }
        return repeats;
    }
}