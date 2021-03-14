package ru.geekbrains.lesson_6;

import java.util.ArrayList;

public class Cat extends Animal{
    private final int MAX_RUN = 200;
    private static ArrayList<Cat> catsList = new ArrayList<>();

    public Cat(String name) {
        super(name);
        catsList.add(this);
    }
    public void run(int letLength) {
        if (letLength <= MAX_RUN) {
            System.out.println(name + " пробежал(а) " + letLength + " м.");
        } else {
            System.out.println(name + " не может пробежать больше " + MAX_RUN + "м.");
        }
    }
        public void swim(int letLength) {
        System.out.println(name + " не умеет плавать, он(а) же кот(кошка)");
    }

    public static int count() {
        int count = 0;
        for (Cat i : catsList) {
            count++;
        }
        return count;
    }
}
