package pl.sdacademy.java.basic.exercises.day1;

public class Task12 {

    public static void main(String[] args) {
        System.out.println("Result of 2%4 = " + ownModuloImplementation(2, 4));
        System.out.println("Result of 4%2 = " + ownModuloImplementation(4, 2));
        System.out.println("Result of 3%4 = " + ownModuloImplementation(3, 4));
        System.out.println("Result of 4%3 = " + ownModuloImplementation(4, 3));

        System.out.println(ifOwnModuloImplementationIsCorrect(2, 4));
        System.out.println(ifOwnModuloImplementationIsCorrect(4, 2));
        System.out.println(ifOwnModuloImplementationIsCorrect(3, 4));
        System.out.println(ifOwnModuloImplementationIsCorrect(4, 3));
    }

    private static int ownModuloImplementation(int a, int b) {
        // weźmy sobie np 17%4 = 1 i mamy wtedy:
        // 4 'wchodzi' w 17 cztery razy i zostaje nam ta reszta 1,
        // więc widać że wystarczy wyliczyć sobie ile razy dana liczba mieści się w
        // drugiej i odjąć je od siebie. Czyli:
        // b(4) * 4(ile razy się mieści) = 16 => (a)17 -16 = 1
        return a - (a / b) * b;
    }

    private static boolean ifOwnModuloImplementationIsCorrect(int a, int b) {
        return ownModuloImplementation(a, b) == (a % b);
    }
}