package ru.geekbrains.qr_1.level_2.lesson_1.creatures;

import ru.geekbrains.qr_1.level_2.lesson_1.obstructions.RunningTrack;
import ru.geekbrains.qr_1.level_2.lesson_1.obstructions.Wall;

public class Cat extends Participant implements Runnable, Jumpable{
    private final String name;
    private static final int maxRun = 800;
    private static final int maxJump = 1;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public boolean jump(Wall wall) {
        boolean isWin = wall.getHeight() <= maxJump;
        printResult(isWin, wall, name);
        return isWin;
    }

    @Override
    public boolean run(RunningTrack track) {
        boolean isWin = track.getLength() <= maxRun;
        printResult(isWin, track, name);
        return track.getLength() < maxRun;
    }

    @Override
    public String getName() {
        return name;
    }

}
