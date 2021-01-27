package com.itacademy.lesson3;

import java.util.Scanner;

public class Task2HomeWork {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число");
            int num = scanner.nextInt();
            int numFib = 0;
            int sum = 0;
            int sum1 = 0;
           while (numFib < num) {
               if (numFib == 0){
                   System.out.println(numFib);
                   numFib=1;
               } else if (numFib == 1) {
                   System.out.println(numFib);
                   numFib += sum ;
                   sum += numFib;
               } else {
                   System.out.println(numFib);
                   sum1 = numFib;
                   numFib = sum;
                   sum = sum1 + numFib;
               }
           }
        }
}
