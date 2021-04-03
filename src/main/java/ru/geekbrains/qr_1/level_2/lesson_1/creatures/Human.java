package ru.geekbrains.qr_1.level_2.lesson_1.creatures;

import ru.geekbrains.qr_1.level_2.lesson_1.obstructions.RunningTrack;
import ru.geekbrains.qr_1.level_2.lesson_1.obstructions.Wall;

public class Human extends Participant implements Runnable, Jumpable{
    private String name;
    private final int maxRun = 1500;
    private final int maxJump = 2;

    public Human(String name) {
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
