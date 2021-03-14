package ru.geekbrains.lesson_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public String info() {
        return "В тарелке : " + food;
    }
    public boolean decreaseFood(int i) {
        if (food > i) {
            food -= i;
            return true;
        } else {
            return false;
        }
    }
    public void addFood(int f) {
        food += f;
        System.out.println("В тарелку добавлено " + f + " еды, всего в тарелке: " + food);
    }
}
