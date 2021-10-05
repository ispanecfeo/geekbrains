package com.company;

public class HomeWork {

    public static void main(String[] args) {
        boolean result = sumWithIn10and20(8, 11);
        System.out.println("result = " + result);
        isPositiveOrNegative(-2);
        System.out.println("Число отрицательное - " + isNegative(4));
        printWordNTimes("Hello world", 5);
        int year = 2021;
        System.out.println(year  + ": високосный год - " + isLeapYear(year));
    }

    public static boolean sumWithIn10and20(int x1, int x2) {
        int sum = x1 + x2;
        return (sum >= 10 && sum <= 20);
    }

    public static void isPositiveOrNegative(int x) {
        String result = (x >= 0) ? "положительное" : "отрицательное";
        System.out.println("Число " + result);
    }

    public static boolean isNegative(int x) {
        return  (x < 0) ? true : false;
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    public static boolean isLeapYear(int year){

        if (year % 4 == 0)  {

            if ((year % 100 == 0) && (year % 400 != 0)) {
                return false;
            }
            return true;
        }
        return  false;
    }

}
