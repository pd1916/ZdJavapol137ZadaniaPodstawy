package pl.sdacademy.java.basic.exercises.day3.task10;

public class Warrior {
    private String name;
    private int strength;
    private int hp;

    public Warrior(String name, int strength, int hp) {
        this.name = name;
        this.strength = strength;
        this.hp = hp;
    }

    public void fight(Warrior enemy) {
        while(enemy.isAlive() && this.isAlive()) {
            enemy.hurt(this.strength);
            this.hurt(enemy.strength);
        }
    }

    private void hurt(int damage) {
        this.hp -= damage;
        System.out.println(this.name + " get " + damage + " damages and have " + this.hp + " hp");
    }


    private boolean isAlive() {
        if (this.hp > 0) {
            return true;
        } else {
            System.out.println(this.name + " already dead");
            return false;
        }
    }
}
