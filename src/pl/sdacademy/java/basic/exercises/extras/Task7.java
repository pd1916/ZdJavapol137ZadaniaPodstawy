package pl.sdacademy.java.basic.exercises.extras;

public class Task7 {

    public static void main(String[] args) {
        int[][] arrays = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Sum of elements on diagonals: " + getSumOfElementsOnDiagonals(arrays));
        System.out.println("Sum of elements on edges: " + getSumOfElementsOnEdges(arrays));
    }

    private static int getSumOfElementsOnDiagonals(int[][] matrix) {
        int sum = 0;
        int size = matrix.length;
        for(int i = 0; i < size; i++) {
            sum += matrix[i][i];
        }
        for(int i = size - 1; i >= 0; i--) {
            sum += matrix[i][i];
        }
        return sum;
    }

    private static int getSumOfElementsOnEdges(int[][] matrix) {
        int sum = 0;
        int size = matrix.length;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(i == 1 && j == 1) {
                    continue;
                }
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}