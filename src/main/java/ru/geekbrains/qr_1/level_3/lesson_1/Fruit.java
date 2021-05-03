package ru.geekbrains.qr_1.level_3.lesson_1;

public abstract class Fruit {
    private final float weight;
    private final String type;

    Fruit(float weight, String type) {
        this.weight = weight;
        this.type = type;
    }
    public float getWeight() {
        return weight;
    }
    public String getType() {
        return type;
    }

}
