package com.itacademy.lesson3;

public class TaskFour {
    public static void main(String[] args) {
        for (char value = 'b'; !isVowel(value) ; value++) {
            System.out.println(value);
        }
    }

    public static boolean isVowel (char value) {
        return value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u' || value == 'y';
    }
// более красивое решение, НО с массивом:
    public static boolean isVowelNew (char value) {
        return "aeiouy".contains(String.valueOf(value));
    }

    //Еще один вариант:
    public static boolean isVowelNew2 (char value) {
        return "aeiouy".indexOf(value) != -1; //проверяем, чтобы value не было равно -1 (возвращает, если
                                              // не находит значения в массиве)
    }
}
