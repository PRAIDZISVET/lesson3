package com.itacademy.lesson3;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int num = scanner.nextInt();

        //if (isNumSimple(num)) {   мое решение:

        // решение на курсах:
            System.out.println(check(num));
    }


    // решение на курсах:
   private static boolean check (int num) {
       boolean result = true;
        for (int i = 2; i < num; i++) {
           if (num % i == 0) {
               result = false;
               break;
//              continue;
           }
       }
           return result;
   }

    // мое решение:
    private static boolean isNumSimple(int num) {
        int counter = 0;
        for (int i = 2; i < num; i++) {
            double ostatok =  num % i;
            if (ostatok ==0) {
                counter += 1;
            }
        }
        if (counter > 0) {
            return  false;
        } else {
            return true;
        }
    }
}
