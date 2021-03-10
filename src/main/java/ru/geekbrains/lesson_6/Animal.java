package ru.geekbrains.lesson_6;

import java.util.ArrayList;

public class Animal {
    protected String name;
    private static ArrayList<Animal> animalList = new ArrayList<>();


    public Animal(String name) {
        this.name = name;
        animalList.add(this);
    }

    public void run(int letLength) {}

    public void swim(int letLength) {}

    public static int count() {
        int count = 0;
        for (Animal i : animalList) {
            count++;
        }
        return count;
    }
}
