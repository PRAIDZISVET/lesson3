package com.itacademy.lesson3;

import java.util.Scanner;

public class Task1HomeWork {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите число");

   //         testFor(scanner);
               testWhile(scanner);
        }

    private static void testFor(Scanner scanner) {
        int result = 0;
        for (int num = scanner.nextInt(); num !=0 ; num /= 10) {
            int ostatok = num % 10;
            result += ostatok;
        }
        System.out.println("Cумма цифр введенного числа: " + result);
    }

    private static void testWhile(Scanner scanner) {
            //int num = 999;
        int num = scanner.nextInt();
        int result = 0;
            while (num != 0) {
                int ostatok = num % 10;
                result += ostatok;
                num /= 10;
            }
            System.out.println("Cумма цифр введенного числа: " + result);
        }

}
