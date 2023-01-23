package pl.sdacademy.java.basic.exercises.day2;

public class Task19 {

    public static void main(String[] args) {
        int[][] firstArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] secondArray = {{10, -1, 5}, {-25, 6, 6}, {12, 8, 9}};
        int[][] result1 = returnArrayWithBiggerSumOfDigit(firstArray, secondArray);
        System.out.print("Bigger array is: ");
        for(int[] i : result1) {
            for(int j : i) {
                System.out.print(j + " ");
            }
        }

        int result2 = returnTheBiggestDigit(firstArray, secondArray);
        System.out.println("\nThe biggest value is: " + result2);

        int result3 = returnTheLowestDigit(firstArray, secondArray);
        System.out.println("The lowest value is: " + result3);
    }

    private static int[][] returnArrayWithBiggerSumOfDigit(int[][] firstArray, int[][] secondArray) {
        int sumOfDigitsFirstArray = sumOfDigits(firstArray);
        int sumOfDigitsSecondArray = sumOfDigits(secondArray);
        return sumOfDigitsFirstArray > sumOfDigitsSecondArray ? firstArray : secondArray;
    }

    private static int sumOfDigits(int[][] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    private static int returnTheBiggestDigit(int[][] firstArray, int[][] secondArray) {
        int sumOfDigitsFirstArray = theBiggestDigit(firstArray);
        int sumOfDigitsSecondArray = theBiggestDigit(secondArray);
        return sumOfDigitsFirstArray > sumOfDigitsSecondArray ? sumOfDigitsFirstArray : sumOfDigitsSecondArray;
    }

    private static int theBiggestDigit(int[][] array) {
        int digit = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if(digit < array[i][j]) {
                    digit = array[i][j];
                }
            }
        }
        return digit;
    }

    private static int returnTheLowestDigit(int[][] firstArray, int[][] secondArray) {
        int sumOfDigitsFirstArray = theSmallestDigit(firstArray);
        int sumOfDigitsSecondArray = theSmallestDigit(secondArray);
        return sumOfDigitsFirstArray < sumOfDigitsSecondArray ? sumOfDigitsFirstArray : sumOfDigitsSecondArray;
    }

    private static int theSmallestDigit(int[][] array) {
        int digit = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if(digit > array[i][j]) {
                    digit = array[i][j];
                }
            }
        }
        return digit;
    }
}