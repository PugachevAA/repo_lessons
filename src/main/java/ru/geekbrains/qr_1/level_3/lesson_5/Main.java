package ru.geekbrains.qr_1.level_3.lesson_5;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;


public class Main {
    public static final int CARS_COUNT = 4;
    public static final CountDownLatch cdl1 = new CountDownLatch(CARS_COUNT);
    public static final CountDownLatch cdWin = new CountDownLatch(1);
    public static final Semaphore smp = new Semaphore(Main.CARS_COUNT/2);
    static String winnerName;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }
        for (int i = 0; i < cars.length; i++) {
            int finalI = i;
            new Thread(() -> {
                cars[finalI].prepare();
                cdl1.countDown();
            }).start();
        }
        cdl1.await();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        final CountDownLatch cdl2 = new CountDownLatch(CARS_COUNT);

        for (int i = 0; i < cars.length; i++) {
            int finalI = i;
            new Thread(() -> {
                if (cars[finalI].run()) {
                    cdWin.countDown();
                    winnerName = cars[finalI].getName();
                }
                cdl2.countDown();
            }).start();
        }
        cdWin.await();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> " + winnerName + " победил!!!");
        cdl2.await();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}
