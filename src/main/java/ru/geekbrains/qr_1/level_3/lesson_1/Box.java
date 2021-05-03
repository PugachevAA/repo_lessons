package ru.geekbrains.qr_1.level_3.lesson_1;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitBox;

    Box() {
        fruitBox = new ArrayList<T>();
    }

    public void putFruit(T fruit) {
        fruitBox.add(fruit);
    }

    public float getWeight() {
        if (fruitBox.size() > 0) {
            return fruitBox.size() * fruitBox.get(0).getWeight();
        }
        return 0;
    }
    public boolean compare(Box compBox) {
        if (this.getWeight() == compBox.getWeight()) {
            return true;
        }
        return false;
    }
    public void shiftToNewBox(Box<T> newBox) {
        for (T t : fruitBox) {
            newBox.putFruit(t);
        }
        fruitBox.clear();
    }
    public ArrayList<T> getBoxList() {
        return fruitBox;
    }
    public String getInfo() {
        if (fruitBox.size() > 0) {
            return "This is box with " + fruitBox.size() + " " + fruitBox.get(0).getType();
        }
        return "This is empty box";
    }
}
