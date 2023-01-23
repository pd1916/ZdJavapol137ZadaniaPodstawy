package pl.sdacademy.java.basic.exercises.extras;

public class Task5 {
    public static void main(String[] args) {
        int input = 8;
        System.out.println(getFibonacciNumber(input));
    }

    private static int getFibonacciNumber(int index) {
        if(index == 0 || index == 1) {
            return 1;
        }
        int[] array = new int[index];
        array[0] = 1;
        array[1] = 1;
        for(int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[index - 1];

        /*if (index == 0 || index == 1) {
            return 1;
        }
        return getValueFromIndex(index - 1) + getValueFromIndex(index - 2);*/
    }
}
