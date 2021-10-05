package ru.geekbrains.lesson1;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void  printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a, b;
        a = 5;
        b = 7;

        int c = a + b;
        System.out.println((c >= 0) ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor(){
        int value = 15;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a, b;
        a = 6;
        b = 14;

        String strOut = (a >= b) ? "a >= b" : "a < c";
        System.out.println(strOut);
    }

}
