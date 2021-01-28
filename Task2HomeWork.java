package com.itacademy.lesson3;

import java.util.Scanner;

public class Task2HomeWork {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число");
            int num = scanner.nextInt();
            int numFib = 0;
            int sum = 0;

   //         fibonacciCycle(num, numFib, sum);   // решение с помощью цикла

    // решение с помощью рекурсии:
               for (int n = 0; fibonacсiRecursive(n) < num; n++) {
                System.out.println(fibonacсiRecursive(n));
            }
        }

    private static int fibonacсiRecursive(int n){
        if (n == 0){
                  return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return fibonacсiRecursive(n - 1) + fibonacсiRecursive(n - 2);
        }
    }

    private static void fibonacciCycle(int num, int numFib, int sum) {
        int sum1;
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
