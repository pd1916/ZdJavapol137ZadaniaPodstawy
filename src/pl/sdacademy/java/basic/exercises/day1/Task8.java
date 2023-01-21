package pl.sdacademy.java.basic.exercises.day1;

public class Task8 {
    public static void main(String[] args) {
        int rangeFrom = 0;
        int rangeTo = 10;


    }

    private static boolean isPrimeNumber(int number) {
        /* number = 7
        for(int i = 2; i <= 6; i++) {
            7%2 będzie reszta
            7%3 będzie reszta
            7%4 będzie reszta
            7%5 będzie reszta
            7%6 będzie reszta
        }
         */
        /* number = 9
        for(int i = 2; i <= 8; i++) {
            9%2 będzie reszta
            9%3 == 0 nie ma reszty, mamy kolejny dzielnik, liczba 9 na pewno nie jest liczbą pierwszą
            9%4
            9%5
            9%6
            9%7
            9%8
        }
         */
        if(number < 2) {
            return false;
        }
        for(int i = 2; i < number/2; i++) {
            if(number%i == 0) {
                return false;
            }
        }
        return true;
    }
}
