package avdeev.geekbrains;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;


public class Car implements Runnable {

    private static int CARS_COUNT;
    private Race race;
    private int speed;
    final CountDownLatch cdl;

    public CountDownLatch getCdlFinish() {
        return cdlFinish;
    }

    final CountDownLatch cdlFinish;
    public Semaphore getSemaphore() {
        return smp;
    }

    Semaphore smp;

    private String name;
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed, CountDownLatch cdl, Semaphore smp, CountDownLatch cdlFinish) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
        this.cdl = cdl;
        this.smp = smp;
        this.cdlFinish = cdlFinish;
    }


    public void prepareCar() {

        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(3000 + (int)(Math.random() * 800 * CARS_COUNT));
            System.out.println(this.name + " готов");
            cdl.countDown();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {

        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
    }


}
