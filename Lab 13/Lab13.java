package ua.lpnuai.Mamchur08;

import java.util.Scanner;

public class Lab13 {

    private static int[] arr = new int[50];
    static long time;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        time = in.nextLong();


        for (int i = 0; i < 50; i++) {
            arr[i] = i % 5;
        }
        Runnable task1 = new Runnable1(arr, 4);
        Thread thread1 = new Thread(task1);
        thread1.setName("Find number");
        thread1.start();
        Runnable task2 = new Runnable2(arr, 4);
        Thread thread2 = new Thread(task2);
        thread2.setName("Find first instance");
        thread2.start();
        Runnable task3 = new Runnable3(arr);
        Thread thread3 = new Thread(task3);
        thread3.setName("Sum");
        thread3.start();
        Runnable task4 = new Runnable4(arr);
        Thread thread4 = new Thread(task4);
        thread4.setName("Min Max");
        thread4.start();
    }
}

class Runnable1 implements Runnable {

    private int[] arr;
    private int el;

    public Runnable1(int[] arr, int el) {
        this.arr = arr;
        this.el = el;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        while(System.currentTimeMillis() - start < Lab13.time);
        int res = 0;
        for(int anArr : arr) {
            if(anArr == this.el) {
                res++;
            }
        }
        System.out.println(res + " Time of execution: " + (System.currentTimeMillis() - start + Lab13.time) / 1000);
    }
}

class Runnable2 implements Runnable {

    private int[] arr;
    private int el;

    public Runnable2(int[] arr, int el) {
        this.arr = arr;
        this.el = el;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        while(System.currentTimeMillis() - start < Lab13.time);
        int res = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == this.el) {
                res = i;
                break;
            }
        }
        System.out.println((res == -1) ? "Not found" : res  + " Time of execution: " + (System.currentTimeMillis() - start + Lab13.time));
    }
}

class Runnable3 implements Runnable {

    private int[] arr;

    public Runnable3(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        while(System.currentTimeMillis() - start < Lab13.time);
        int res = 0;
        for(int anArr : arr) {
            res += anArr;
        }
        System.out.println("Sum = " + res  + " Time of execution: " + (System.currentTimeMillis() - start + Lab13.time) / 1000);
    }
}

class Runnable4 implements Runnable {

    private int[] arr;

    public Runnable4(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        long start = System.currentTimeMillis();
        while(System.currentTimeMillis() - start < Lab13.time);
        for(int anArr : arr) {
            if(anArr > max) {
                max = anArr;
            }
            if(anArr < min) {
                min = anArr;
            }
        }
        System.out.println("Max value - " + max + " Min value - " + min  + " Time of execution: " + (System.currentTimeMillis() - start + Lab13.time) / 1000);
    }
}