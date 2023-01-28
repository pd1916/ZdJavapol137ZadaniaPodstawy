package pl.sdacademy.java.basic.exercises.day3;

public class Main {

    public static void main(String[] args) {
//        if(args.length > 0) {
//            System.out.println("posiadam parametry wejściowe");
//            System.out.println(args.length);
//            for(String s : args) {
//                System.out.println(s);
//            }
//        } else {
//            System.out.println("nie posiadam parametrów wejściowych");
//        }
        if(args.length == 1) {
            //walidacja poprwności daty
            System.out.println("Generuję raport od dnia " + args[0] + " do dnia dzisiejszego");
        } else {
            System.out.println("Genreuję raport od początku bieżącego miesiąca");
        }
    }

}
