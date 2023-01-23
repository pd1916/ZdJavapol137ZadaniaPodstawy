package pl.sdacademy.java.basic.exercises.extras;

public class Task8 {
    private static final int COLUMN = 10;
    private static final int ROW = 3;

    public static void main(String[] args) {
        int[][] arrays = fillData();
        printResult(arrays);
    }

    private static void printResult(int[][] arrays) {
        for(int[] a : arrays) {
            for(int element : a) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] fillData() {
        int[][] arrays = new int[ROW][COLUMN];
        for(int i = 0; i < COLUMN; i++) {
            arrays[0][i] = i + 1;
            arrays[1][i] = arrays[0][i] * arrays[0][i];
            arrays[2][i] = arrays[1][i] * arrays[0][i];
        }
        return arrays;
    }
}