package com.company;

/*
   Homework 3
   @author Авдеев Станислав
   @version 12.10.2021
 */


import java.util.Arrays;

public class HomeWorkArrays {

    public static void main(String[] args) {

        System.out.println("1: ");
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        System.out.println(Arrays.toString(convertingArrayElements(arr)));
        System.out.println("");
        System.out.println("2:");

        int[] arrHundred = new int[100];
        System.out.println(Arrays.toString(fillArray(arrHundred)));
        System.out.println("");
        System.out.println("3:");

        int[] arrMultipli = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(MultiplyNumbersLessSix(arrMultipli)));
        System.out.println("");
        System.out.println("4:");

        int[][] matrix = new int[5][5];
        matrix = fillDiagonalsOfMatrix(matrix);
        showMatrix(matrix);

        System.out.println("5:");
        System.out.println(Arrays.toString(initializeAndFillingArray(7, 15)));
        System.out.println("");

        int[] minmaxArr = {5, -2, 12, 7, 89, 45, 23, 8};
        int[] res = findMinMaxElementArr(minmaxArr);

        System.out.println("6:");
        if (res.length > 1) {
            System.out.println("min =" + res[0]);
            System.out.println("max =" + res[1]);
        }
        System.out.println("");

        int[] arrBalance = {1, 1, 1, 2, 1};
        System.out.println("7:");
        System.out.println(checkBalance(arrBalance));
        System.out.println("");

        System.out.println("8:");
        int[] sourceArr = { 3, 5, 6, 1, 8};
        System.out.println(Arrays.toString(moveArray(sourceArr, 1)));

    }

    static int[] convertingArrayElements(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
        }
        return arr;

    }

    static int[] fillArray(int[] arr) {

        for (int i = 1; i <= arr.length; i++) {
            arr[i-1] = i;
        }
        return arr;

    }

    static int[] MultiplyNumbersLessSix(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
        }
        return arr;
    }

    static int[][] fillDiagonalsOfMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else if (j == matrix[i].length - 1 - i) {
                    matrix[i][j] = 1;
             } else
                    matrix[i][j] = 0;
            }
        }
        return  matrix;
    }

    static void showMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

    }

    static int[] initializeAndFillingArray(int len, int initialValue){
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return  arr;
    }

    static int[] findMinMaxElementArr(int[] arr) {
        int min = 0;
        int max = 0;

        for (int i : arr) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        int[] res = new int[2];
        res[0] = min;
        res[1] = max;
        return  res;

    }

    static boolean checkBalance(int[] arr) {

        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            rightSum = 0;
            for (int j = i+1; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum)
                return true;
            
        }
        return false;
    }

    static int[] moveArray(int[] arr, int move) {
        int tmp1 = 0;
        int tmp2 = 0;
        boolean firstConvert = true;


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + move; j < arr.length; j++) {
                if (firstConvert) {
                    tmp1 = arr[j];
                    arr[j] = arr[i];
                    firstConvert = false;
                    continue;
                }

                tmp2 = arr[j];
                arr[j] = tmp1;
                tmp1 = tmp2;

                if (j == arr.length - 1) {
                    arr[0] = tmp1;
                    return arr;
                }
            }
        }
    return  arr;

    }

}
