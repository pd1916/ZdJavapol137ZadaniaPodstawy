package pl.sdacademy.java.basic.exercises.day2;

public class Konwersje {

    public static void main(String[] args) {
        //jawna konwersja liczb zmiennoprzecinkowych na całkowite -> tracimy informacje o ułamku/ wartosc po przecinku
        int firstValue = (int) 123.456F;
        System.out.println("firstValue: " + firstValue);

        long secondValue = (long) 456.789;
        System.out.println("secondValue: " + secondValue);

        double value7 = 33.999;
        int value8 = (int) value7;
        System.out.println("value8: " + value8);

        int value9 = (int) Math.round(value7);
        System.out.println("value9: " + value9);

        //automatyczna konwersja typow -> kompilator wykona konwersję gdy jest ona bezpieczna, i nie nastąpi utrata informacji

        /*niejawna/automatyczna konwersja z typu int(który jest typem domyślnym dla liczb całkowitych)
        na typ long
         */
        long value3 = 123;
        System.out.println("value3: " + value3);

        /*
        powstaje int, rzutujemy na short'a i znów rzutujemy na inta
         */
        int value4 = (short) 123;
        System.out.println("value4: " + value4);

        float value5 = 123.456F;
        double value6 = value5; // konwersja automatyczna/niejawna z floata na doubla

        /*niejawna/automatyczna konwersja typów podczas oepracji arytmetycznych/matematycznych
         * jeżeli którykolwiek z elementów(liczb) naszej operacji jest typu double -> cały wynik będzie double
         * jeżeli którykolwiek z elementów(liczb) naszej operacji jest typu float -> cały wynik będzie float
         * jeżeli którykolwiek z elementów(liczb) naszej operacji jest typu long -> cały wynik będzie long
         */

        short value10 = 1;
        int value11 = 2;
        long value12 = 3;
        float value13 = 4.4F;
        double value14 = 5.5;

        System.out.println("int z double: " + (value11 + value14));
        System.out.println("int z floatem: " + (value11 + value13));
        long l = value11 + value12;
        int i = value10 + value10;

    }
}
