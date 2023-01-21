package pl.sdacademy.java.basic.exercises.day1;

public class Task1 {

    public static void main(String[] args) {
        displayWordUsingDecimalFormat();
        System.out.println();
        displayWordUsingBinaryFormat();
        System.out.println();
        displayWordUsingHexaFormat();
    }

    private static void displayWordUsingDecimalFormat() {
        char s = 83;
        char d = 68;
        char a = 65;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }

    private static void displayWordUsingBinaryFormat() {
        char s = 0b01010011;
        char d = 0b01000100;
        char a = 0b01000001;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }

    private static void displayWordUsingHexaFormat() {
        char s = 0x53;
        char d = 0x44;
        char a = 0x41;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }
}
