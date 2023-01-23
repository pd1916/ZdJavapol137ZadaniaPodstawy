package pl.sdacademy.java.basic.exercises.day2;

import java.util.Arrays;

public class Task14 {

    public static void main(String[] args) {
        int[] inputs = {12, -7, 19, -5};
        System.out.println("Input: " + Arrays.toString(inputs));
        int lengthOfNewArray = countNegativeValuesInArray(inputs);
        if(lengthOfNewArray > 0) {
            int[] negativeDigits = createArrayWithOnlyNegativeValues(inputs, lengthOfNewArray);
            System.out.print("Result: ");
            for(int i = 0; i < negativeDigits.length; i++) {
                System.out.print(negativeDigits[i] + ", ");
            }
        }
    }

    private static int countNegativeValuesInArray(int[] input) {
        int counter = 0;
        for(int element : input) {
            if(element < 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int[] createArrayWithOnlyNegativeValues(int[] input, int noNegativeNumbers) {
        int[] result = new int[noNegativeNumbers];
        for(int i = 0, j = 0; i < input.length; i++) {
            if(input[i] < 0) {
                result[j++] = input[i];
            }
        }
        return result;
    }
}