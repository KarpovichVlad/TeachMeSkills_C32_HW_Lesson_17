package com.teachmeskills.c32.hw.lesson_17.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ApplicationRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Введите дату в формате dd-MM-yyyy (например, 01-12-2024):");
        String inputDate = scanner.nextLine();

        try {
            LocalDate date = LocalDate.parse(inputDate, formatter);
            String dayOfWeek = date.getDayOfWeek().toString();
            System.out.println(dayOfWeek);
        } catch (DateTimeParseException e) {
            System.out.println("Некорректный формат даты.");
        }finally {
            scanner.close();
        }
    }
}
