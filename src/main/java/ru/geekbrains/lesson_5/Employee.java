package ru.geekbrains.lesson_5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    Employee(String name, String position, String email, int phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public String getInfo() {
        return String.format("ФИО: %s, должность: %s, email: %s, тел.: %d, зарплата: %d, возраст: %d",
                name, position, email, phone, salary, age);
    }
    public int getAge() {
        return age;
    }
}
