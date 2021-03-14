package ru.geekbrains.lesson_7;

public class Cat {
    private final String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        satiety = p.decreaseFood(appetite);
        if (!satiety) {
            System.out.println("Котику по имени " + name + " не хватило еды :(");
        }
    }

    public String getSatiety() {
        if (satiety) {
            return "Котейка по имени " + name + " сыт :)";
        } else {
            return "Котейка по имени " + name + " голоден :(";
        }
    }
}
