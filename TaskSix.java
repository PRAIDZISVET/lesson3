package com.itacademy.lesson3;

public class TaskSix {
    public static void main(String[] args) {
        int result = 0;
        for (int inputValue = 999; inputValue !=0 ; inputValue /= 10) {
            int ostatok = inputValue % 10;
            result += ostatok;
        }
        System.out.println(result);
    }

    private static void testWhile() {
        int inputValue = 999;
        int result = 0;
        while (inputValue != 0) {
            int ostatok = inputValue % 10;
            result += ostatok;
            inputValue /= 10;
        }
        System.out.println(result);
    }
}
