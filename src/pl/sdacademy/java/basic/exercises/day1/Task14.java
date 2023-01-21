package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task14 {

    private static Scanner input;
    private static final double DEFAULT_AMOUNT_MIN = 1_000;
    private static final double DEFAULT_AMOUNT_MAX = 5_000;
    private static final int DEFAULT_NUMBER_OF_INSTALLMENTS_MIN = 18;
    private static final int DEFAULT_NUMBER_OF_INSTALLMENTS_MAX = 36;
    private static final double FIRST_THRESHOLD = 2.5;
    private static final double SECOND_THRESHOLD = 5;
    private static final double THIRD_THRESHOLD = 10;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        double amount = setAndVerifyAmount();
        int numberOfInstallments = setAndVerifyNumberOfInstallments();
        double singleAmountOfInstallments = getSingleAmountOfInstallments(numberOfInstallments, amount);
        System.out.println("Single instalment: " + singleAmountOfInstallments);
    }

    private static double setAndVerifyAmount() {
        System.out.print("Please insert amount: ");
        double amount = input.nextDouble();
        if(amount < 100) {
            System.out.printf("Amount is too small. Default value %.2f was set\n", DEFAULT_AMOUNT_MIN); // %.2f -> sposób formatowania liczb zmiennoprzecinkowych
            return DEFAULT_AMOUNT_MIN;
        } else if(amount > 10_000) {
            System.out.printf("Amount is too big. Default value %.2f was set\n", DEFAULT_AMOUNT_MAX);
            return DEFAULT_AMOUNT_MAX;
        }
        return amount;
    }

    private static int setAndVerifyNumberOfInstallments() {
        System.out.print("Please insert number of installments: ");
        int numberOfInstallments = input.nextInt();
        if(numberOfInstallments < 6) {
            System.out.printf("Number of installments is too small. Default value %d was set\n", DEFAULT_NUMBER_OF_INSTALLMENTS_MIN); // %.2f -> sposób formatowania liczb
            return DEFAULT_NUMBER_OF_INSTALLMENTS_MIN;
        } else if(numberOfInstallments > 48) {
            System.out.printf("Number of installments is too big. Default value %d was set\n", DEFAULT_NUMBER_OF_INSTALLMENTS_MAX);
            return DEFAULT_NUMBER_OF_INSTALLMENTS_MAX;
        }
        return numberOfInstallments;
    }

    private static double getSingleAmountOfInstallments(int numberOfInstallments, double amount) {
        double singleAmountOfInstallment;
        if(numberOfInstallments >= 6 && numberOfInstallments < 13) {
            singleAmountOfInstallment = calculateTotalAmountWithThreshold(FIRST_THRESHOLD, amount) / numberOfInstallments;
        } else if(numberOfInstallments >= 13 && numberOfInstallments < 25) {
            singleAmountOfInstallment = calculateTotalAmountWithThreshold(SECOND_THRESHOLD, amount) / numberOfInstallments;
        } else {
            singleAmountOfInstallment = calculateTotalAmountWithThreshold(THIRD_THRESHOLD, amount) / numberOfInstallments;
        }
        singleAmountOfInstallment = Math.round(singleAmountOfInstallment * 100);
        return singleAmountOfInstallment / 100;
    }

    private static double calculateTotalAmountWithThreshold(double currentPercent, double amount) {
        return ((currentPercent / 100) + 1) * amount;
    }
}
