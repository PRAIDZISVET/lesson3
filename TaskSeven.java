package com.itacademy.lesson3;

public class TaskSeven {
    public static void main(String[] args) {
        int inputValue = 20023143;
        String result = "";
        int count = 3;
        while (inputValue != 0) {
            int ostatok = inputValue % 10;
             if (count == 0) {
                 result = ostatok + " " + result;
                 count = 3;
             } else {
                 result = ostatok + result;
             }
             inputValue /= 10;
             count--;
        }
        System.out.println(result);
    }
// Мое решение, НО не убирает первый лидирующий ноль:
    private static String getStringMy(int inputValue, String result) {
        while (inputValue != 0) {
            int ostatok = inputValue % 1000;
            if (ostatok<100 && ostatok >=10) {
                result = "0" + ostatok + " " + result;
            } else
                if (ostatok < 10) {
                    result = "00" + ostatok + " " + result;
                } else {
                    result = ostatok + " " + result;
                }
            inputValue /= 1000;
        }
        return result;
    }
}
