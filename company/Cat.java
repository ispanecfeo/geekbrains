package com.company;

/*
   Homework 6
   @author Авдеев Станислав
   @version 03.11.2021
 */

public class Cat extends Animal {

    private int limitationRun;

    {
        this.limitationRun = 500;     
    }

    public Cat() {
        Animal.countAnimal++;
    }

    @Override
    public void setLimitationRun(int limitationRun) {
        this.limitationRun = limitationRun;
    }

    @Override
    public void setLimitionSwim(int limitionSwim) {   
         System.out.println("Our cat can't swim");
    }

    @Override
    protected Boolean run(int length) {
        return this.limitationRun >= length;
    }

    @Override
    protected Boolean swim(int length) {
        return false;
    }
}
