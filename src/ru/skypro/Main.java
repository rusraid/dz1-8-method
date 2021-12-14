package ru.skypro;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int currentYear = LocalDate.now().getYear();
        printIsLeapYear(currentYear);

        printDeviceInfo(1, 2017);

        printDeliveryDistance(95);
        int deliveryDays = printDeliveryDistance(95);
        System.out.println(deliveryDays);

        checkingDuplicates("aabccddefgghiijjkk");

        int[] array = {3, 2, 1, 6, 5};
        reverseArray(array);
        System.out.println(Arrays.toString(array));


    }

    //      task1
    public static void printIsLeapYear(int year) {
        boolean yearLeap = isYearLeap(year);
        printIsLeapYearResult(year, yearLeap);
    }

    private static boolean isYearLeap(int year) {
        return (year % 100 != 0 && year % 4 == 0) || year % 400 == 0;
    }

    private static void printIsLeapYearResult(int year, boolean yearLeap) {
        if (yearLeap) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }

    //        task2
    private static void printDeviceInfo(int clientOs, int clientDeviceYear) {

        if (clientDeviceYear < 2015 && clientOs == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    //    task3
    private static int
    printDeliveryDistance(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20)
            deliveryDays++;
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDays++;
        }
        return deliveryDays;
    }

    //    task4
    private static void checkingDuplicates(String input) {
        char[] chars = input.toCharArray();
        char previous = Character.MAX_VALUE;
        for (char letter : chars) {
            if (letter == previous) {
                System.out.println("Найден дубль для символа " + letter);
                return;
            }
            previous = letter;
        }
        System.out.println("Дубль не найден");
    }

    //    task5
    private static void reverseArray(int[] array) {
        int head = 0;
        int tail = array.length - 1;
        while (head < tail) {
            int temp = array[head];
            array[head++] = array[tail];
            array[tail--] = temp;
        }
    }

}