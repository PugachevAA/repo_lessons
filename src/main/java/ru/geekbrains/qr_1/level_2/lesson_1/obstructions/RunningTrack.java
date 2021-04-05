package ru.geekbrains.qr_1.level_2.lesson_1.obstructions;

public class RunningTrack extends Obstruction {
    private static String type = "беговая дорожка";
    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }


    public int getLength() {
        return length;
    }

    @Override
    public String getType() {
        return type;
    }
}
