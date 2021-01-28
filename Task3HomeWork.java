package com.itacademy.lesson3;

import java.util.Scanner;

public class Task3HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дней");
        int numDays = scanner.nextInt();
        int sumPrecipitation = 0;
        int maxPrecipitation = 0;

        for (int i = 1; i <= numDays ; i++) {
            System.out.println("Введите количетсво осадков в день " +i);
            int precipitationI = scanner.nextInt();
            sumPrecipitation += precipitationI;
            if (maxPrecipitation < precipitationI) {
                maxPrecipitation = precipitationI;
            }
        }
        double averagePrecipitation = (double) sumPrecipitation/numDays;
        System.out.println("Количество дней: " + numDays);
        System.out.println("Сумма осадков за период (" + numDays + "): " + sumPrecipitation);
        System.out.printf("Cреднее количество осадков за период: %.2f \n",averagePrecipitation);
        System.out.println("Максимальное количество дневных осадков за период: "+ maxPrecipitation);
    }
}
