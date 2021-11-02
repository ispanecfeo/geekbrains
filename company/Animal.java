package com.company;
/*
   Homework 6
   @author Авдеев Станислав
   @version 03.11.2021
 */
   
public abstract class Animal {

    public abstract void setLimitationRun(int limitationRun) ;
    public abstract void setLimitionSwim(int limitionSwim);

    protected abstract Boolean run(int length) ;
    protected abstract Boolean swim(int length) ;

    protected static int countAnimal = 0;

}
