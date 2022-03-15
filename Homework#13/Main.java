package avdeev.geekbrains;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Main {
    public static final int CARS_COUNT = 4;

    public static void main(String[] args) {

        CountDownLatch cdl = new CountDownLatch(CARS_COUNT);
        CountDownLatch cdlFinish = new CountDownLatch(CARS_COUNT);

        Semaphore smp = new Semaphore(CARS_COUNT / 2);

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        System.out.println("");

        Race race = new Race(
                new Road(120, false),
                new Tunnel(),
                new Road(100, true)
        );

        Car[] cars = new Car[CARS_COUNT];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(
                 race,
                 20  + (int) (Math.random() * 10),
                 cdl,
                 smp,
                 cdlFinish
            );
        }

        for(Car car : cars) {
            new Thread(car::prepareCar).start();
        }

        try {
            cdl.await();
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
            System.out.println("");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(Car car : cars) {
            new Thread(car).start();
        }

        try {
            cdlFinish.await();
            System.out.println("");
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
