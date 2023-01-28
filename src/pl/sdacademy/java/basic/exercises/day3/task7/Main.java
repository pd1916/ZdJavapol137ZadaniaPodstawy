package pl.sdacademy.java.basic.exercises.day3.task7;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Mruczek");
        cats[1] = new Cat("Filemon");
        cats[2] = new Cat("Bonifacy");

//        Cat cat = new Cat("Filemon");
//        Cat cat1 = new Cat("Filemon");
//        System.out.println(cat.equals(cat1));
//        System.out.println(cat == cat1);
//        System.out.println(cat.toString());
//        System.out.println(cat1);

        int i = 5;
        for(Cat cat : cats) {
            System.out.println(cat);
            //System.out.println(cat.toString());
            cat.makeSound();
            cat.eatMice(i++ * i);
            System.out.println("***");
        }
    }
}
