package pl.sdacademy.java.basic.exercises.extras;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] input = {1, 0, 5, 10, 0, 6};
        System.out.println("Input: " + Arrays.toString(input));
        System.out.print("Output: ");
        int[] result = moveZerosToEndOfArray(input);
        System.out.println("Result: " + Arrays.toString(result));
    }

    private static int[] moveZerosToEndOfArray(int[] digitArray) {
        int[] modifiedDigitArray = new int[digitArray.length];
        int counter = 0;
        for(int i = 0; i < digitArray.length; i++) {
            if(digitArray[i] != 0) {
                modifiedDigitArray[counter] = digitArray[i];
                counter++;
            }
        }
        return modifiedDigitArray;
    }
}
