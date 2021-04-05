package ru.geekbrains.qr_1.level_2.lesson_1.obstructions;

public class Wall extends Obstruction {
    private static String type = "Стена";
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String getType() {
        return type;
    }
}
