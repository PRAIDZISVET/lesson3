package com.itacademy.lesson3;

public class SecondTask {
    public static void main(String[] args) {
        int inputValue = 3;
    //решение с помощью for:
    //factorial();

            System.out.println(factorialRecursive(inputValue));

        //решение с помощью while
       // int result = whileFactorial(inputValue);
       // System.out.println(result);
    }

    private static int whileFactorial(int inputValue) {
        int result = 1;
        while (inputValue >  0) {
            result *= inputValue;
            inputValue--;
        }
        return result;
    }

    private static int factorialRecursive (int value) {
        if (value == 1) {
            return value;
        }
        return value * factorialRecursive(--value);
    }

    private static int factorial(int inputValue) {
        int result = 1;
        for (int i = 1; i <= inputValue; i++) {
            result *= i;
        }
        return result;
    }
}
