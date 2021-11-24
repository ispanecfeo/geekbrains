package avdeev.geekbrains;

import java.util.Arrays;

public class Main {

    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    static float[] arr  = new float[SIZE];
    static float[] arr1 = new float[HALF];
    static float[] arr2 = new float[HALF];

    public static void main(String[] args) throws InterruptedException {

        method1();
        method2();

    }

    public static class Inner {

        public void m1() {

            for (int i = 0; i < HALF; i++) {
                arr1[i] = (float)(arr1[i] * Math.sin(0.2f + 1f / 5) * Math.cos(0.2f + 1f / 5) * Math.cos(0.4f + 1f / 2));
            }

        }

        public void m2() {

            for (int i = 0; i < HALF; i++) {
                arr2[i] = (float)(arr2[i] * Math.sin(0.2f + 1f / 5) * Math.cos(0.2f + 1f / 5) * Math.cos(0.4f + 1f / 2));
            }

        }
    }

    public static void method1() {

        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + 1f / 5) * Math.cos(0.2f + 1f / 5) * Math.cos(0.4f + 1f / 2));
        }

        System.out.println("Метод 1: " + (System.currentTimeMillis() - a));

    }

    public static void method2() throws InterruptedException {

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);

        Inner w1 = new Inner();

        var t1 = new Thread(w1::m1);
        var t2 = new Thread(w1::m2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);

        System.out.println("Метод 2: " + (System.currentTimeMillis() - a));


    }


}
