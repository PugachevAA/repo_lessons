package ru.geekbrains.qr_1.level_2.lesson_1.creatures;

import ru.geekbrains.qr_1.level_2.lesson_1.obstructions.Course;
import ru.geekbrains.qr_1.level_2.lesson_1.obstructions.Obstruction;
import ru.geekbrains.qr_1.level_2.lesson_1.obstructions.RunningTrack;
import ru.geekbrains.qr_1.level_2.lesson_1.obstructions.Wall;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Participant> team;
    private ArrayList<Participant> winners;
    private ArrayList<Participant> loosers;

    public Team(String teamName) {
        this.teamName = teamName;
        team = new ArrayList<>();
        winners = new ArrayList<>();
        loosers = new ArrayList<>();
    }
    public void addMember(Participant member) {
        team.add(member);
    }
    public void getTeamInfo() {
        int n = 1;
        System.out.println("Состав команды " + teamName + ":");
        for (Participant p : team) {
            System.out.println("Участник №" + n + ": " + p.getName());
            n++;
        }
    }

    public void overcome(Course c) {
        winners.clear();
        loosers.clear();
        int obsToWin = c.getCourse().size();

        for (Participant p : team) {
            int winCount = 0;
            for (Obstruction o : c.getCourse()) {
                if (o instanceof Wall) {
                    if (!p.jump((Wall) o)) {
                        loosers.add(p);
                        break;
                    }
                } else if (o instanceof RunningTrack) {
                    if (!p.run((RunningTrack) o)) {
                        loosers.add(p);
                        break;
                    }
                }
                winCount ++;
            }
            if (winCount == obsToWin) {
                winners.add(p);
            }
        }
    }

    public void printResult() {
        if (winners.size() > 0) {
            if (winners.size() == team.size()) {
                System.out.println("Все участники команды прошли полосу препятствий!");
            } else {
                System.out.println("Полосу препятствий прошли не все :(");
            }
            System.out.print("Прошли полосу препятствий: ");
            for (Participant p : winners) {
                System.out.print(p.getName() + " ");
            }

            if (loosers.size() > 0) {
                System.out.print("\nПолосу препятствий не прошли: ");
                for (Participant l : loosers) {
                    System.out.println(l.getName() + " ");
                }
            }
        } else {
            System.out.println("Команда не проходила полосу препятствий");
        }
    }

}
