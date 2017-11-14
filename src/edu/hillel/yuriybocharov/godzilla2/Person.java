package edu.hillel.yuriybocharov.godzilla2;


public class Person {
    private int speed;
    private int armor;
    private int attack;

    public Person() {
    }

    public int refreshAttack(int attack) {
        this.attack = attack;
        return attack;
    }

    public int refreshArmor(int armor) {
        this.armor = armor;
        return armor;
    }

    public Person(int speed, int armor, int attack) {
        this.speed = speed;
        this.armor = armor;
        this.attack = attack;
    }

    public int getSpeed() {
        return speed;
    }

    public int getArmor() {
        return armor;
    }

    public int getAttack() {
        return attack;
    }

    public Person(int speed) {
        this.speed = speed;
    }

    public Person(int armor, int attack) {
        this.armor = armor;
        this.attack = attack;
    }

}
