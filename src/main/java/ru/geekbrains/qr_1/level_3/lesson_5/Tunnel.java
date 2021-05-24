package ru.geekbrains.qr_1.level_3.lesson_5;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage{
    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }
    @Override
    public void go(Car c) {
        try {
            Semaphore smp = new Semaphore(Main.CARS_COUNT/2);
            try {
                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
                Main.smp.acquire();
                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " закончил этап: " + description);
                Main.smp.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
