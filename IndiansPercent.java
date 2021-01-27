package com.itacademy.lesson3;

import java.math.BigDecimal;

public class IndiansPercent {
    public static void main(String[] args) {
        int currentYear = 2021;
        BigDecimal sum = BigDecimal.valueOf(24L);
        BigDecimal percent = BigDecimal.valueOf(0.05);
        for (int startYear = 1627; startYear <= currentYear ; startYear++) {
            BigDecimal percentSum = sum.multiply(percent);
            sum = sum.add(percentSum);
            System.out.println(startYear+ " год:" + "доход: "+ percentSum + " сумма: " + sum);
        }
        System.out.println("Сумма на текущий год: " + sum);
    }

    private static void test2() {
        int currentYear = 2021;
        double sum = 24;
        double percent = 0.05;
        for (int startYear = 1627; startYear <= currentYear ; startYear++) {
            double percentSum = sum * percent;
            sum = sum + percentSum;
            System.out.println(startYear+ " год:" + "доход: "+ percentSum + " сумма: " + sum);
        }
        System.out.println("Сумма на текущий год: " + sum);
    }
}
