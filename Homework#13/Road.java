package avdeev.geekbrains;


import java.util.concurrent.locks.ReentrantLock;

public class Road extends Stage {

    private boolean lastSection;
    private boolean isWinner = false;
    private final Object monitor;

    public Road(int length, boolean lastSection) {
        this.length = length;
        this.description = "Дорога " + length + " метров";
        this.lastSection = lastSection;
        this.monitor = new Object();

    }
    @Override
    public void go(Car c) {
        try {
            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000L);
            System.out.println(c.getName() + " закончил этап: " + description);

            if (this.lastSection) {
                synchronized (this.monitor) {
                    if (!this.isWinner) {
                        System.out.println(c.getName() + " WINNER!!!");
                        this.isWinner = true;
                    }
                }
                c.getCdlFinish().countDown();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
