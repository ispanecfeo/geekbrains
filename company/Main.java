package com.company;

/*
   Homework 6
   @author Авдеев Станислав
   @version 03.11.2021
 */

public class Main {

    public static void main(String[] args) {

        Cat barsik = new Cat();
        barsik.setLimitationRun(600);

        if (barsik.run(700)) {
            System.out.println("Barsik good run");
        } else {
            System.out.println("Barsik still needs to train to run");
        }

        barsik.setLimitionSwim(20);


        Dog lassy = new Dog();
        lassy.setLimitionSwim(20);

        if (lassy.run(450)) {
            System.out.println("Lassy good run");
        } else {
            System.out.println("Lassy still needs to train to run");
        }

        if (lassy.swim(40)) {
            System.out.println("Lassy good swiming");
        } else {
            System.out.println("Lassy still needs to train to swim");
        }

        System.out.println("Total animals: " + Animal.countAnimal);

    }
}
