package pl.sdacademy.java.basic.exercises.day1;

public class Task6 {

    public static void main(String[] args) {
        //printMultiplicationTable();
        printMultiplicationTable(6, 2, 5);
    }

    private static void printMultiplicationTable() {
        for(int i = 1; i <= 4; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }

    private static void printMultiplicationTable(int multiplier, int minMultiplicand, int maxMultiplicand) {
        for(int i = minMultiplicand; i <= maxMultiplicand; i++) {
            int result = multiplier * i;
            System.out.println(multiplier + " x " + i + " = " + result);
        }
    }
}
