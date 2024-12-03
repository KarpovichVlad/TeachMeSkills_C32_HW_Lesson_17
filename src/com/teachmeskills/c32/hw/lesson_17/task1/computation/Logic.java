package com.teachmeskills.c32.hw.lesson_17.task1.computation;

import com.teachmeskills.c32.hw.lesson_17.task1.interfaces.MyFunction;

import java.util.Scanner;

public class Logic {
    public void processInput(int choice, Scanner scanner) {
        if(choice == 1){
            System.out.println("Введите строку для реверса: ");
            scanner.nextLine();
            String inputString = scanner.nextLine();

            MyFunction<String>  reverseString = str -> new StringBuilder(str).reverse().toString();

            String reversed = reverseString.apply(inputString);
            System.out.println("Реверсированная строка: " + reversed);

        } else if (choice == 2) {
            System.out.println("Введите число для вычисления факториала: ");
            int inputNumber = scanner.nextInt();

            MyFunction<Integer> factorial = number -> {
                int result = 1;
                for (int i = 1; i <= number; i++) {
                    result *= i;
                }
                return result;
            };

            int fact = factorial.apply(inputNumber);
            System.out.println("Факториал числа " + inputNumber + ": " + fact);

        } else {
            System.out.println("Неверный ввод. Пожалуйста, введите 1 или 2.");
        }
    }
}

