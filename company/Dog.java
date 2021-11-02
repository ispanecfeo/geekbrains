package com.company;

/*
   Homework 6
   @author Авдеев Станислав
   @version 03.11.2021
 */

public class Dog extends Animal {

    private int  limitationRun;
    private int limitionSwim;

    {
        this.limitationRun = 500;
        this.limitionSwim = 10;
    }

    public Dog() {
        Animal.countAnimal++;
    }

    @Override
    public void setLimitationRun(int limitationRun) {
        this.limitationRun = limitationRun;
    }

    @Override
    public void setLimitionSwim(int limitionSwim) {
        this.limitionSwim = limitionSwim;
    }

    @Override
    protected Boolean run(int length) {
        return this.limitationRun >= length;
    }

    @Override
    protected Boolean swim(int length) {
        return this.limitionSwim >= length;
    }
}
