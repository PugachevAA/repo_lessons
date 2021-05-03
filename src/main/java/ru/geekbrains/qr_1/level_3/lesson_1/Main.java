package ru.geekbrains.qr_1.level_3.lesson_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "c", "d"};
        Integer[] arr2 = {1, 2, 3, 4};

        System.out.println("replaced: " + replaceArrayElements(1,3,arr1));
        System.out.println(Arrays.toString(arr1));
        System.out.println("replaced: " + replaceArrayElements(1,3,arr2));
        System.out.println(Arrays.toString(arr2));

        ArrayList list1 = arrayToList(arr1);
        System.out.println("this is array list from array: " + list1);

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        appleBox.putFruit(apple1);
        appleBox.putFruit(apple2);
        //appleBox.putFruit(orange1); //некорректный аргумент, не получится положить апельсин в коробку для яблок

        System.out.println("Weight of box with " + appleBox.getBoxList().get(0).getType() + ": " + appleBox.getWeight());

        orangeBox.putFruit(orange1);
        orangeBox.putFruit(orange2);

        System.out.println("Boxes are equal? - " + appleBox.compare(orangeBox));

        Box<Apple> newAppleBox= new Box<>();
        appleBox.shiftToNewBox(newAppleBox);
        System.out.println(appleBox.getInfo());
        System.out.println(newAppleBox.getInfo());

        Box<Orange> newOrangeBox = new Box<>();
        //appleBox.shiftToNewBox(newOrangeBox);  //некорректный аргумент, нельзя переложить в коробку для апельсинов

    }


    public static <T> boolean replaceArrayElements( int i1, int i2, T[] arr) {
        if (i1 < arr.length && i2 < arr.length) {
            T temp = arr[i1];
            arr[i1] = arr[i2];
            arr[i2] = temp;
            return true;
        }
        return false;
    }
    public static <T> ArrayList<T> arrayToList(T[] arr) {
        ArrayList<T> arrayList = new ArrayList<>();
        for (T t : arr) {
            arrayList.add(t);
        }
        return arrayList;
    }

}
