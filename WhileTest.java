package com.itacademy.lesson3;

public class WhileTest {
    public static void main(String[] args) {
        for (int i = 0; i < ; i++) {
            System.out.println(i);
        }
    }

    private static void doWhileTest() {
        int i = 0;
        do {
            System.out.println(i++);
        }
        while (i<5);
    }

    private static void test() {
        int i =0;
        while (checkValue(i)) {
            System.out.println(i);
            i++;
        }
    }

    private static boolean checkValue(int i) {
        return i<10;
    }
}
