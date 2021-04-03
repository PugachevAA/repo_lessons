package ru.geekbrains.qr_1.level_2.lesson_1.obstructions;

import java.util.ArrayList;

public class Course {
    private ArrayList<Obstruction> course;

    public Course() {
        course = new ArrayList<>();
    }
    public void addObs(Obstruction obs) {
        course.add(obs);
    }
    public ArrayList<Obstruction> getCourse() {
        return course;
    }
}
