package ru.geekbrains.lesson_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int[] intArr1 = {0, 1, 1, 0, 1, 0, 0, 1};
    for (int i = 0; i <intArr1.length; i++) {
        if (intArr1[i] == 0) {
            intArr1[i] = 1;
        } else {
            intArr1[i] = 0;
        }
    }
    System.out.println(Arrays.toString(intArr1));

    System.out.println("---");

    int[] intArr2 = new int[8];
    for (int i = 0, j = 0; i < intArr2.length; i++, j+=3) {
        intArr2[i] = j;
    }
    System.out.println(Arrays.toString(intArr2));

    System.out.println("---");

    int[] intArr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

    for (int i = 0; i < intArr3.length; i++) {
        if (intArr3[i] < 6) {
            intArr3[i] *= 2;
        }
    }
    System.out.println(Arrays.toString(intArr3));

    System.out.println("---");

    int[][] intArr4 = new int[7][7];
    for (int i = 0, j = 0; i < intArr4.length; i++, j++) {
        intArr4[i][i] = 1;
    }
    for (int i = 0, j = intArr4.length-1; i < intArr4.length; i++, j--) {
        intArr4[i][j] = 1;
    }
    for (int i = 0; i < intArr4.length; i++) {
        System.out.println(Arrays.toString(intArr4[i]));
    }

    System.out.println("---");

    int[] intArr5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    int min = intArr5[0];
    int max = intArr5[0];
    for (int i = 1; i < intArr5.length; i++) {
        if (intArr5[i] > max) max = intArr5[i];
        if (intArr5[i] < min) min = intArr5[i];
    }
    System.out.println("Максимум: " + max);
    System.out.println("Минимум: " + min);

    System.out.println("---");

    //int[] intArr6 = {1,2,2,1,1,4,2,1};
    int[] intArr6 = {1, 5, 3, 2, 1, 7, 3, 2};
    System.out.println(checkBalance(intArr6));
    System.out.println(checkBalance2(intArr6));

    System.out.println("---");

    int[] intArr7 = {1, 2, 3, 4, 5, 6, 7, 8};
    intArr7 = move(intArr7, -3);
    System.out.println(Arrays.toString(intArr7));
}

    public static boolean checkBalance(int[] intArr6) {
        boolean check = false;
        int left;
        int right = 0;

        left = 0;
        for (int i = 0; i < intArr6.length; i++) {
            left += intArr6[i];
            right = 0;
            for (int j = i + 1; j < intArr6.length; j++) {
                right += intArr6[j];
            }
            if (left == right) {
                check = true;
                System.out.println("Сумма с каждой стороны: " + left);
                break;
            }
        }
        return check;
    }

    public static boolean checkBalance2(int[] intArr6) {
        boolean check = false;
        int left = 0;
        int right = 0;

        for (int i = 0; i < intArr6.length; i++) {
            right += intArr6[i];
        }

        for (int i = 0; i < intArr6.length; i++) {
            left += intArr6[i];
            right -= intArr6[i];
            if (left == right) {
                check = true;
                System.out.println("Сумма с каждой стороны: " + left);
                break;
            }
        }
        return check;
    }

    public static int[] move(int[] intArr7, int n) {
        int container;

        if (n < 0) {
            for (int i = 1; i <= -n; i++) {
                container = intArr7[0];
                for (int j = 0; j < intArr7.length-1 ; j++) {
                    intArr7[j] = intArr7[j + 1];
                }
                intArr7[intArr7.length-1] = container;
            }

        } else if (n > 0) {
            for (int i = 1; i <= n; i++) {
                container = intArr7[intArr7.length-1];
                for (int j = intArr7.length - 1; j > 0 ; j--) {
                    intArr7[j] = intArr7[j - 1];
                }
                intArr7[0] = container;
            }
        }
        return intArr7;

    }
}
