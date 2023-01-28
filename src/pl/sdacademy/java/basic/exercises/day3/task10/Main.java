package pl.sdacademy.java.basic.exercises.day3.task10;

public class Main {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("Stormtrooper_1", 5, 100);
        Warrior warrior2 = new Warrior("Anakin", 10, 100);
        warrior2.fight(warrior1);
    }
}
