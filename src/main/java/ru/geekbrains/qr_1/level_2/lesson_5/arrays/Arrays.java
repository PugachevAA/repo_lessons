package ru.geekbrains.qr_1.level_2.lesson_5.arrays;

public class Arrays {
    static final int size = 10000000;
    static final int h = size/2;
    static int endCount = 0;


    public static void array1Thrd() {
        float[] arr = new float[size];
        fillArr(arr);
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = calc(arr[i], i);
        }
        System.out.println("Время работы первого метода: " + (System.currentTimeMillis() - a) + "мс");
    }

    public static void array2Thrds()  {
        float[] arr = new float[size];
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];

        fillArr(arr);

        long allTime = System.currentTimeMillis();

        long a1 = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);
        System.out.println("Время разбивки массива: " + (System.currentTimeMillis() - a1) + "мс");

        Thread thread1 = newThread(arr1);
        Thread thread2 = newThread(arr2);
        thread1.start();
        thread2.start();
        while (true) {
            if (getEndCount() >=2 ) {
                long a2 = System.currentTimeMillis();
                System.arraycopy(arr1, 0, arr, 0, h);
                System.arraycopy(arr2, 0, arr, h, h);
                System.out.println("Время склейки массива: " + (System.currentTimeMillis() - a2) + "мс");
                System.out.println("Время работы второго метода: " + (System.currentTimeMillis() - allTime) + "мс");
                break;
            }
        }
    }

    public static Thread newThread(float[] arr) {
        return new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    long time = System.currentTimeMillis();
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = calc(arr[i], i);
                    }
                    System.out.println("Время работы потока: " + (System.currentTimeMillis() - time) + "мс");
                    setEndCount(getEndCount() + 1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void fillArr(float[] arr){
        for (float f : arr) {
            f = 1;
        }
    }
    public static float calc(float arr, int i) {
        return (float)(arr * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
    }

    public synchronized static int getEndCount() {
        return endCount;
    }

    public synchronized static void setEndCount(int endCount) {
        Arrays.endCount = endCount;
    }
}
