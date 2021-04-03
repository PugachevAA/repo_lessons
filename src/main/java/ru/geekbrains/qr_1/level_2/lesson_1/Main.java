package ru.geekbrains.qr_1.level_2.lesson_1;

import ru.geekbrains.qr_1.level_2.lesson_1.creatures.*;
import ru.geekbrains.qr_1.level_2.lesson_1.obstructions.Course;
import ru.geekbrains.qr_1.level_2.lesson_1.obstructions.Obstruction;
import ru.geekbrains.qr_1.level_2.lesson_1.obstructions.RunningTrack;
import ru.geekbrains.qr_1.level_2.lesson_1.obstructions.Wall;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Alex");
        Human human2 = new Human("Viktor");
        Cat cat1 = new Cat("Edem");
        Cat cat2 = new Cat("Mouse");
        Robot robot1 = new Robot("Rino-b2");
        Robot robot2 = new Robot("Vally");

        Wall wall1 = new Wall(2);
        RunningTrack track1 = new RunningTrack(800);

        Team team = new Team("Рога и копыта");
        Course c = new Course();
        team.addMember(human1);
        team.addMember(cat2);
        team.addMember(human2);
        team.addMember(robot1);

        c.addObs(wall1);;
        c.addObs(track1);

        team.getTeamInfo();
        System.out.println("\nКоманда начала прохождение препятствий:");
        team.overcome(c);
        System.out.println("\nРезультаты команды:");
        team.printResult();

    }



}
