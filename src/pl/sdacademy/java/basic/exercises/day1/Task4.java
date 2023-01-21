package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task4 {
    private static final float BMI_MIN_RANGE = 18.5F;
    private static final float BMI_MAX_RANGE = 24.9F;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int height = getHeightFromUser();
        float weight = getWeightFromUser();
        float bmi = calculateBMI(weight, height);
        displayBmiResult(bmi);
    }

    private static float getWeightFromUser() {
        System.out.print("Please insert weight in kg: ");
        return scanner.nextFloat();
    }

    private static int getHeightFromUser() {
        System.out.print("Please insert height in cm: ");
        return scanner.nextInt();
    }

    private static float calculateBMI(float weight, int height) {
        // 185 cm => 1,85
        float heightInMeter = height / 100F;
        return weight / (heightInMeter * heightInMeter);
    }

    private static void displayBmiResult(float bmi) {
        if(bmi >= BMI_MIN_RANGE && bmi <= BMI_MAX_RANGE) {
            System.out.println("BMI is correct: " + bmi);
        } else {
            System.out.println("BMI is not correct: " + bmi);
        }
    }
}
