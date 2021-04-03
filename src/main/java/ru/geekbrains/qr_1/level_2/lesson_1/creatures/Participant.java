package ru.geekbrains.qr_1.level_2.lesson_1.creatures;

import ru.geekbrains.qr_1.level_2.lesson_1.obstructions.Obstruction;
import ru.geekbrains.qr_1.level_2.lesson_1.obstructions.RunningTrack;
import ru.geekbrains.qr_1.level_2.lesson_1.obstructions.Wall;

public abstract class Participant {

    public abstract boolean jump(Wall wall);
    public abstract boolean run(RunningTrack track);

    public boolean printResult(boolean isWin, Obstruction obs, String name) {
        if (isWin) {
            System.out.println(name + " преодолел препятствие " + obs.getType());
            return true;
        } else {
            System.out.println(name + " не смог преодолеть препятствие " + obs.getType() + " и выбывает");
            return false;
        }
    }
    public abstract String getName();
}
