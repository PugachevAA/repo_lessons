package ru.geekbrains.lesson_3.guessTheWord;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana",
                "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        letsGame(words);
    }


    public static void letsGame(String[] words) {
        String word;
        String answer;
        String hint;

        word = words[(int)(Math.random() * words.length - 1)];
        System.out.println("Угадай слово:");
        while (true) {
            answer = inputAnswer();
            if (word.equals(answer)) {
                System.out.println("Ты угадал!");
                break;
            } else {
                System.out.println("Ответ не верный, вот буквы, которые стоят на своих местах:");
                hint = hint(word, answer);
                System.out.println(hint);
                System.out.println("Попробуй еще раз:");
            }
        }
    }


    private static String inputAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static String hint(String word, String answer) {
        String hint = "";

        int length = Math.min(word.length(), answer.length());

        for (int i = 0; i < 15; i++) {
            if (i < length) {
                char a = answer.charAt(i);
                char b = word.charAt(i);
                if (a == b) hint += a;
                else hint += "#";
            } else hint += "#";
        }
        return hint;
    }
}
