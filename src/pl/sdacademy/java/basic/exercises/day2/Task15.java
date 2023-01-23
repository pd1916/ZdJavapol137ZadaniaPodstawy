package pl.sdacademy.java.basic.exercises.day2;

import java.util.Arrays;

public class Task15 {

    public static void main(String[] args) {
        String[] firstArray = {"Ala", "ma", "kota"};
        String[] secondArray = {"Ala", "ma", "kotaa"};
        System.out.println("Input:");
        System.out.println("    FirstArray: " + Arrays.toString(firstArray));
        System.out.println("    SecondArray: " + Arrays.toString(secondArray));
        System.out.println("Result: " + areEqual(firstArray, secondArray));
    }

    private static boolean areEqual(String[] firstArray, String[] secondArray) {
        if(firstArray.length == secondArray.length) {
            for(int i = 0; i < firstArray.length; i++) {
                String firstArrElement = firstArray[i];
                String secondArrElement = secondArray[i];
                if(firstArrElement == null && secondArrElement == null) {
                    continue;
                }
                if(firstArrElement == null || (!firstArrElement.equals(secondArrElement))) {
                    return false;
                }
            }
        }
        return true;
    }
}