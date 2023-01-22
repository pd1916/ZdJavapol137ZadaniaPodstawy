package pl.sdacademy.java.basic.exercises.day2;

public class Task13 {

    public static void main(String[] args) {
        int[] inputs = {12, 7, 19};

//        int[] inputs2 = new int[3];
//        inputs2[0] = -4;
//        inputs2[1] = 5;
//        inputs2[2] = 8;

        System.out.println("MinValue: " + getMinValue(inputs));
        System.out.println("MaxValue: " + getMaxValue(inputs));
        System.out.println("Sum: " + sum(inputs));
    }

    private static int getMinValue(int[] inputs) {
//        for(int i = 0; i < inputs.length; i++) {
//            System.out.println(inputs[i]);
//        }
        int minValue = inputs[0];
        //int minValue = Integer.MAX_VALUE;
        for(int element : inputs) {
            if(minValue > element) {
                minValue = element;
            }
        }
        return minValue;
    }

    private static int getMaxValue(int[] inputs) {
        int maxValue = inputs[0];
        for(int item : inputs) {
            if(item > maxValue) {
                maxValue = item;
            }
        }
        return maxValue;
    }

    private static int sum(int[] inputs) {
        int sum = 0;
        for(int i : inputs) {
            sum += i;
        }
        return sum;
    }


}
