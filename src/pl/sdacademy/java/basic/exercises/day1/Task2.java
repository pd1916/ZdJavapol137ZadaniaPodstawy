package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task2 {
    //private static final float PI = 3.14F;
    private static final double PI = Math.PI;

    public static void main(String[] args) {
        float radius = getDiameterFromUser() / 2;
        float circumference = calculateCircumferenceOfCircle(radius);
        float area = calculateAreaOfCircle(radius);
        System.out.println("Circumference Of A Circle: " + circumference);
        System.out.println("Area Of A Circle: " + area);
    }

    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert diameter: ");
        return scanner.nextFloat();
    }

    private static float calculateCircumferenceOfCircle(float radius) {
        // 2 * pi * radius
        return 2 * (float) PI * radius;
    }

    private static float calculateAreaOfCircle(float radius) {
        // pi * radius^2
        return (float) (PI * Math.pow(radius, 2));
    }
}
