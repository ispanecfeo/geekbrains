package com.company;

/*
   Homework 5
   @author Авдеев Станислав
   @version 28.10.2021
 */


import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class Employer {

    private String fio;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employer(String fio, String post, String email, String phone, int salary, int age){
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s, возврастом %s,  работает на должности \"%s\", с заработанной платой %d, с ним (ней) можно " +
                "связаться по телефону %s или email %s",
                this.fio,
                this.age,
                this.post,
                this.salary,
                this.phone,
                this.email) ;
    }



    public static void main(String[] args) {

        Employer[] employers = new Employer[5];

        employers[0] = new Employer("Ivanov Sergey Ivanovich", "director", "director@gmail.com",
                "+397873782873", 1000000, 55);

        employers[1] = new Employer("Petrova Svetlana Sergeevna", "teacher", "teacPC@gmail.com",
                "+89755485746", 230000, 41);

        employers[2] = new Employer("Lavrov Petr Andreevich", "driver", "bmwPC@gmail.com",
                "+79967464738", 590000, 33);

        employers[3] = new Employer("Serdycova Nina Vasilivna", "programmer", "IBM@gmail.com",
                "+14967464738", 77777777, 42);

        employers[4] = new Employer("Sanin Nikita Mihailovich", "gamer", "Fifa21@gmail.com",
                "+23432435785", 77777777, 21);

        for (Employer em: employers) {
            if (em.age <= 40) continue;
            System.out.println(em);
        }

    }



}

