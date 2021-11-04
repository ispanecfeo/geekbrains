package com.company;
/*
   Homework 6
   @author Авдеев Станислав
   @version 03.11.2021
   Не стал в этом классе объявлять поля лимитов по бегу
   и по плаванию как protect, т.к пришлось бы класс 
   Main переносить в другой пакет, чтобы у него не было 
   возможности обратиться к этим полям напрямую, поэтому 
   сделал лимиты по бегу в Cat и Dog как privat и лимит 
   по плаванию только в Cat как private. Получилась некоторая
   избыточность, пошел на это чтобы не городить 2 пакета, а так 
, по-хорошему создал бы в этом классе лимиты по бегу и 
  по плаванию как protected, тип Integer , для возможности 
  установить null для лимита по плаванию у Cat
 */
   
public abstract class Animal {

    public abstract void setLimitationRun(int limitationRun) ;
    public abstract void setLimitionSwim(int limitionSwim);

    protected abstract Boolean run(int length) ;
    protected abstract Boolean swim(int length) ;

    protected static int countAnimal = 0;

}
