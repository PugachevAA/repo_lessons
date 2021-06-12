package ru.geekbrains.qr_1.level_3.lesson_7;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;


import ru.geekbrains.qr_1.level_3.lesson_7.annotations.AfterSuite;
import ru.geekbrains.qr_1.level_3.lesson_7.annotations.BeforeSuite;
import ru.geekbrains.qr_1.level_3.lesson_7.annotations.Test;

public class RunTestsClass {

    public static void start(Class obj) {
        Method[] methods = obj.getMethods();
        ArrayList<Method> before = new ArrayList<>();
        ArrayList<Method> after = new ArrayList<>();
        LinkedList<Method> testMethods2 = new LinkedList();
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {

                if (annotation.annotationType() == BeforeSuite.class){
                    before.add(method);
                }
                if (annotation.annotationType() == AfterSuite.class){
                    after.add(method);
                }
                if (annotation.annotationType() == Test.class){
                    if (testMethods2.size() > 0) {
                        int i = 0;
                        for (i = 0; i < testMethods2.size(); i++) {
                            if (testMethods2.get(i).getAnnotation(Test.class).priority() >= method.getAnnotation(Test.class).priority()) {
                                testMethods2.add(i, method);
                                break;
                            }
                        }
                        if (i == testMethods2.size()) {
                            testMethods2.add(method);
                        }
                    } else {
                        testMethods2.add(method);
                    }
                }
            }
        }
        if (before.size() > 1 || after.size() > 1) {
            throw new RuntimeException("Неверное колличество аннотаций");
        }
        runMethods(before, obj);
        runMethods(testMethods2, obj);
        runMethods(after, obj);


    }


    private static void runMethods(List<Method> m, Object obj) {
        for (Method mtd : m) {
            try {
                mtd.invoke(obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

}
