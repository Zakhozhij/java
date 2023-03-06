package Homework;

import Homework.Units.*;

/*
 * Крестьянин, разбойник, снайпер, колдун, копейщик, арбалетчик, монах. 
 * Для каждого сформировать список свойств и возможных действий. 
 * Напрнимер свойство скорость, действие нанести удар. 
 * Проанализировать получившиеся свойства и действия персонажей и 
 * создать Обобщённый класс описывающий свойства и действия имеющиеся у всех персонажей. 
 * Создать этот класс. Создать классы для каждого типа персонажей наследующие и расширяющие абстрактный(обобщённый) класс. 
 * В основной программе создать по одному экземпляру каждого типа персонажей.
 */
public class Program {
    public static void main(String[] args) {

        Hero hero1 = new Magician();
        System.out.println(hero1.getInfo());

        Hero hero2 = new Robber();
        System.out.println(hero2.getInfo());

        Hero hero3 = new Sniper();
        System.out.println(hero3.getInfo());

        Hero hero4 = new Bowman();
        System.out.println(hero4.getInfo());

        Hero hero5 = new Peasant();
        System.out.println(hero5.getInfo());

        Hero hero6 = new Spearman();
        System.out.println(hero6.getInfo());

        Hero hero7 = new Monk();
        System.out.println(hero7.getInfo());

        System.out.println("-------Let's attack--------");
        hero3.Attack(hero2);
        System.out.println(hero2.getInfo());
    }   
}
