package ru.geekbrains.lesson_1;

public class FirstApp {
    public static void main(String[] args) {
        short sh = 9;
        int i = 10;
        long l = 1000000000000000000L;

        float f = 11.5f;
        double dbl = 25.5;

        char ch = 30;
        char ch2 = 'v';

        boolean bln = true;


        float   a = 1,
                b = 2,
                c = 3,
                d = 4;
        int     i1 = 20,
                i2 = 7,
                i3 = -4,
                year = 2021;
        String name = "Алексей";


        float func = func(a,b,c,d);
        System.out.println(func);

        boolean checkSum = check1020(i1, i2);
        System.out.println(checkSum);
        if (checkSum) {
            System.out.println("Сумма " + i1 + " и " + i2 + " в пределах от 10 до 20");
        } else {
            System.out.println("Сумма " + i1 + " и " + i2 + " не в пределах от 10 до 20");
        }

        checkPositive(i3);

        System.out.println("---\nВозвращаем bool");
        System.out.println(checkPositiveBool(i3));

        helloName(name);

        leapYear(year);
        }

    public static float func(float a,float b,float c,float d) {
        System.out.println("Вычислим выражение a*(b+(c/d)):");
        return a * (b + (c / d));
    }

    public static boolean check1020(int a, int b) {
        System.out.println("---\nПроверим вхождение суммы в предел от 10 до 20:");
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkPositive(int a) {
        System.out.println("---\nПроверяем, положительное число или отрицательное:");
        if (a < 0) {
            System.out.println("Число " + a + " отрицательное");
        } else {
            System.out.println("Число " + a + " положительное");
        }
    }

    public static boolean checkPositiveBool(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void helloName(String name) {
        System.out.println("---\nВыводим в консоль строку с именем:");
        System.out.println("Привет, " + name);
    }

    public static void leapYear(int year) {
        System.out.println("---\nПроверяем, високосный год или нет:");
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Год " + year + " - високосный");
        } else {
            System.out.println("Год " + year + " - не високосный");
        }
    }
}
