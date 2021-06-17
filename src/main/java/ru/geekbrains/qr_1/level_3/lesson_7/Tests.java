package ru.geekbrains.qr_1.level_3.lesson_7;

import ru.geekbrains.qr_1.level_3.lesson_7.annotations.AfterSuite;
import ru.geekbrains.qr_1.level_3.lesson_7.annotations.BeforeSuite;
import ru.geekbrains.qr_1.level_3.lesson_7.annotations.Test;

public class Tests {

    @BeforeSuite
    public static void startMethod() {
        System.out.println("BeforeSuite method");
    }

    @Test(priority = 1)
    public static void testMethod1() {
        System.out.println("Test method 1");
    }

    @Test(priority = 3)
    public static void testMethod2() {
        System.out.println("Test method 2");
    }

    @Test(priority = 2)
    public static void testMethod3() {
        System.out.println("Test method 3");
    }

    @Test(priority = 2)
    public static void testMethod4() {
        System.out.println("Test method 4");
    }


    @AfterSuite
    public static void endMethod() {
        System.out.println("AfterSuite method");
    }

//    @AfterSuite
//    public static void endMethod2() {
//        System.out.println("AfterSuite method2");
//    }


}
