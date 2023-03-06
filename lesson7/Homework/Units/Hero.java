package Homework.Units;

import java.util.concurrent.ThreadLocalRandom;

public class Hero {
    protected static int number;
    protected static ThreadLocalRandom r;

    protected String name;
    protected int hp;
    protected int maxHp;
    protected int speed;
    protected int intelligence;
    protected int agility;

    static {
        Hero.number = 0;
        Hero.r = ThreadLocalRandom.current();
    }

    public Hero(String name, int hp, int speed, int intelligence, int agility) {
        this.name = name;
        this.hp = hp;
        this.speed = speed;
        this.maxHp = hp;
        this.intelligence = intelligence;
        this.agility = agility;
    }

    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Speed: %d  Intelligence: %d Agility: %d Type: %s ",
                this.name, this.hp, this.speed, this.intelligence, this.agility, this.getClass().getSimpleName());
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
    }

    public void Attack(Hero target) {
        int damage = Hero.r.nextInt(20);
        target.GetDamage(damage);
    }

}
