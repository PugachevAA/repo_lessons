package ru.geekbrains.lesson_6;

import java.util.ArrayList;

public class Dog extends Animal{
    private final int MAX_RUN = 500;
    private final int MAX_SWIM = 10;
    private static ArrayList<Dog> dogsList = new ArrayList<>();

    public Dog(String name) {
        super(name);
        dogsList.add(this);
    }
    @Override
    public void run(int letLength) {
        if (letLength <= MAX_RUN) {
            System.out.println(name + " пробежал " + letLength + " м.");
        } else {
            System.out.println(name + " не может пробежать больше " + MAX_RUN + "м.");
        }

    }
    @Override
    public void swim(int letLength) {
        if (letLength <= MAX_SWIM) {
            System.out.println(name + " проплыл " + letLength + " м.");
        } else {
            System.out.println(name + " не может проплыть больше " + MAX_SWIM + "м.");
        }
    }

    public static int count() {
        int count = 0;
        for (Dog i : dogsList) {
            count++;
        }
        return count;
    }
}
