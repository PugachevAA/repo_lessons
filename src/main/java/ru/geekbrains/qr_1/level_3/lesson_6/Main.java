package ru.geekbrains.qr_1.level_3.lesson_6;

public class Main {
    public static void main(String[] args) {
    }

    public static int[] arrayAfter4(int[] arr) {
        int[] result;
        int cutPosition = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                cutPosition = i;
            }
        }
        if (cutPosition >=0) {
            int resultLen = arr.length-cutPosition-1;
            result = new int[resultLen];
            for (int i = cutPosition+1, j = 0; i < arr.length ; i++, j++) {
                result[j] = arr[i];
            }
        } else {
            throw new RuntimeException("Массив не содержит 4");
        }
        return result;
    }

    public static boolean checkArray(int[] arr) {
        boolean haveOne = false;
        boolean haveFour = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                return false;
            } else {
                if (arr[i] == 1) {
                    haveOne = true;
                }
                if (arr[i] == 4) {
                    haveFour = true;
                }
            }
        }
        return haveOne && haveFour;
    }

}
