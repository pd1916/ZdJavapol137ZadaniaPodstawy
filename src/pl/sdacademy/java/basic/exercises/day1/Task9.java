package pl.sdacademy.java.basic.exercises.day1;

public class Task9 {

    public static void main(String[] args) {
        int rangeTo = Integer.parseInt(args[0]);
        System.out.println("Range from 1 to " + rangeTo);
        for(int i = 1; i <= rangeTo; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    private static String fizzBuzz(int number) {
        if(number % 15 == 0) {
            return "FizzBuzz";
        } else if(number % 5 == 0) {
            return "Buzz";
        } else if(number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}













