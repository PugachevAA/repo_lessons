package ru.geekbrains.qr_1.level_2.lesson_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] wordsArray = {"палец",
                                    "рычаг",
                                    "свиток",
                                    "палец",
                                    "утюг",
                                    "паста",
                                    "утюг",
                                    "состав",
                                    "капуста",
                                    "уролог",
                                    "какойещеуролог",
                                    "ковбой"};

        Set<String> uniq = new HashSet();
        for (int i = 0; i < wordsArray.length; i++) {
            uniq.add(wordsArray[i]);
        }

        printColl(uniq);

        Map<String, Integer> countArr = new HashMap();

        for (String s : uniq) {
            int cnt = 0;
            for (int i = 0; i < wordsArray.length; i++) {
                if (s.equals(wordsArray[i])) {
                    cnt++;
                }
            }
            countArr.put(s, cnt);
        }
        for (Map.Entry<String, Integer> o : countArr.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }


        YellowPages yp = new YellowPages();
        yp.add("Иван","+78574561315");
        yp.add("Иван","+78574562345");
        yp.add("Олег","+78574562222");
        yp.add("Михаил","+78532562233");
        yp.add("Олег","+79994562344");

        System.out.println("Номера телефонов: " + yp.get("Олег"));

    }

    static void printColl(Collection col) {
        for (Object c : col) {
            System.out.println(c);
        }
    }
}
