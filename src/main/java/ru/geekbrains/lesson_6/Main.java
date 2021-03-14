package ru.geekbrains.lesson_6;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Эдем");
        Animal cat2 = new Cat("Мышь");
        Animal dog1 = new Dog("Кокос");
        cat1.run(50);
        cat1.run(250);
        cat2.swim(25);
        dog1.run(300);
        dog1.run(600);
        dog1.swim(5);
        dog1.swim(50);

        System.out.println("Количество животных: " + Animal.count());
        System.out.println("Количество котов: " + Cat.count());
        System.out.println("Количество собак: " + Dog.count());
    }

}
