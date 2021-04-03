package ru.geekbrains.lesson_7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барс", 5);
        cats[1] = new Cat("Кокос", 4);
        cats[2] = new Cat("Мыша", 5);
        cats[3] = new Cat("Бакс", 7);
        cats[4] = new Cat("Люля", 8);
        Plate plate = new Plate(25);

        System.out.println(plate.info());

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        for (Cat cat : cats) {
            System.out.println(cat.getSatiety());
        }

        plate.addFood(30);
    }
}
