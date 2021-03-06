package ru.geekbrains.lesson_3.guessTheNumber2Players;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int players;
        int level;

        System.out.println("Ваша задача угадать число.");

        players = players();
        level = level();
        letsGame(level, players);

        scanner.close();
    }

    private static int players() {
        int players;
        System.out.println("Введите количество игроков (1 или 2):");
        players = readInput();
        while (players < 1 || players > 2) {
            System.out.println("Только 1 или 2 игрока, введите заново:");
            players = readInput();
        }
        return players;
    }
    private static int level() {
        int level;

        System.out.println("Выберите уровень:");
        System.out.println("1 - легкий; от 1 до 10");
        System.out.println("2 - средний; от 1 до 50");
        System.out.println("3 - тяжелый; от 1 до 100");
        System.out.println("q - выйти");

        level = readInput();
        while (level <= 0 || level > 3) {
            System.out.println("Не верный номер уровня, введите заново:");
            level = readInput();
        }
        int i = -1;
        switch (level) {
            case 1:
                i = 10;
                break;
            case 2:
                i = 50;
                break;
            case 3:
                i = 100;
                break;
        }
        return i;
    }

    private static void letsGame(int range, int players) {
        int number = (int)(Math.random() * range);
        System.out.println("Угадайте число от 0 до " + range + " (для выхода - q):");
        boolean win = false;
        while (!win) {
            for (int i = 1; i <= players; i++) {
                System.out.println("Игрок " + i + ":");
                int inputNumber = readInput();
                if (inputNumber == number) {
                    System.out.println("Игрок " + i + " выиграл!");
                    win = true;
                    break;
                } else if (inputNumber > number) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Загаданное число больше");
                }
            }
        }
    }



    private static int readInput() {
        String regex = "[0-9]+";
        String input = "";
        boolean isInt = false;

        while (!isInt) {
            input = scanner.nextLine();
            if (input.equals("q")) {
                System.out.println("Выход");
                System.exit(1);
            }
            isInt = input.matches(regex);
            if (isInt) break;
            System.out.println("Введите цифры или нажмите q для выхода:");
        }
        return Integer.parseInt(input);
    }
}
