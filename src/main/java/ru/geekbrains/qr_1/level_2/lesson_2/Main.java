package ru.geekbrains.qr_1.level_2.lesson_2;

import ru.geekbrains.qr_1.level_2.lesson_2.exceptions.MyArrayDataException;
import ru.geekbrains.qr_1.level_2.lesson_2.exceptions.MyArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] stringArray = {{"1", "2", "3", "g"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            System.out.println(calcSumOfArray(stringArray));
        } catch (MyArraySizeException | MyArrayDataException ex) {
            ex.printStackTrace();
        }
    }


    public static int calcSumOfArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        boolean correctArray = true;
        int sum = 0;

        if (arr.length == 4) {
            for (String[] a : arr) {
                if (a.length != 4) {
                    correctArray = false;
                }
            }
        } else {
            correctArray = false;
        }
        if (!correctArray) {
            throw new MyArraySizeException("Некорректный размер массива");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Некорректные данные в элементе [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }

}
