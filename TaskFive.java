package com.itacademy.lesson3;

import java.util.Random;

public class TaskFive {
    public static void main(String[] args) {
        Random random = new Random();
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            int randomValue = random.nextInt(100);
            System.out.println(randomValue);
            if (randomValue > maxValue) {
                maxValue = randomValue;
            }
        }
        System.out.println("Максимальное число: " + maxValue);
    }
}
