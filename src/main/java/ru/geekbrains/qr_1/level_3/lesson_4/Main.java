package ru.geekbrains.qr_1.level_3.lesson_4;

public class Main {
    private final Object mon = new Object();
    private volatile char currentLetter = 'A';
    private final int n = 5;

    public static void main(String[] args) {
        Main main = new Main();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                main.printA();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                main.printB();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                main.printC();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

    }

    public void printA() {
        synchronized (mon) {
            try {
                for (int i = 0; i < n; i++) {
                    while (currentLetter != 'A') {
                        mon.wait();
                    }
                    System.out.print("A");
                    currentLetter = 'B';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB() {
        synchronized (mon) {
            try {
                for (int i = 0; i < n; i++) {
                    while (currentLetter != 'B') {
                        mon.wait();
                    }
                    System.out.print("B");
                    currentLetter = 'C';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void printC() {
        synchronized (mon) {
            try {
                for (int i = 0; i < n; i++) {
                    while (currentLetter != 'C') {
                        mon.wait();
                    }
                    System.out.print("C");
                    currentLetter = 'A';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
