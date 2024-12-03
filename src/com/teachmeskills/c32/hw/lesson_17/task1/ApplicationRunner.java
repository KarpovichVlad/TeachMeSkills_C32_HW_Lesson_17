package com.teachmeskills.c32.hw.lesson_17.task1;

import com.teachmeskills.c32.hw.lesson_17.task1.operations.Logic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ApplicationRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите цифру (1 - реверс строки, 2 - факториал числа): ");
            int choice = scanner.nextInt();

            Logic logic = new Logic();
            logic.processInput(choice, scanner);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено некорректное значение. Ожидается число.");
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
